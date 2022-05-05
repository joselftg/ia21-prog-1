const readline = require('readline')
const { stdin: input, stdout: output } = require('process')
const rl = readline.createInterface({ input, output })
const question = q => new Promise((rs, rj) => rl.question(q + ' ', a => rs(a)))

let soma = 0
let count = 0
let media = 0

void async function () {
    while (true) {
        let strNota = await question(`Digite o valor da ${count + 1}° nota ou N/n para cacular a média entre os valores inseridos:`)
        if (strNota.toUpperCase() == 'N') break
        let nota = parseFloat(strNota)
        if(isNaN (nota)) {
            console.log("Por Favor Digite um número")
            continue
        }

        if(nota<=10 && nota>=0){
        soma = soma + nota
        count++ }
        
    }
        if(count==0){
            console.log("O programa vai fechar")
            process.exit()
        }
    media = soma / count
    console.log(`[ RESULTADO ] Sua média é`, media)
    process.exit()
}()