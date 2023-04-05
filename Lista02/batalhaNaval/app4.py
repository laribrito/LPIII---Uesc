from jogador import Jogador
import random, time, os

# variaveis
MAX_RANDOM = 7
player1 = Jogador(1);
player2 = Jogador(2);
numerosRandomicos = True
# se true, o jogo roda com números aleatórios
# se false, o jogo roda com entradas do usuario

# funcoes
def limpaTela():
    retorno = os.system('clear')
    if retorno != 0:
        os.system('clear')

def recebeValores():
    if numerosRandomicos:
        return random.randint(0, MAX_RANDOM+1), random.randint(0, MAX_RANDOM+1)
    x, y = input().split(' ')
    x = int(x)
    y = int(y)
    return x, y

def recebeCoordenada():
    tempx, tempy = recebeValores()
    if numerosRandomicos:
        print(f'{tempx} {tempy}')
    return tempx, tempy

def intro():
    limpaTela()
    print("\n\n\n\tWelcome to Battleship!!!")
    print('\n')
    delay()
    limpaTela()

def fimGame(ganhador: Jogador):
    limpaTela()
    print(f'{ganhador.getNome()} WINS! You sunk all of your opponent\'s ships!')
    print(f'Map of {player1.getNome()}')
    player1.exibeMapaPlayer()
    print(f'Map of {player2.getNome()}')
    player2.exibeMapaPlayer()

def delay(segundos=2):
    time.sleep(segundos)

def pegaCoordenadas(jogador:Jogador):
    print(f'{jogador.getNome()}, enter yours ship\'s coordinates.')
    i = 0
    while i < Jogador.qtdNavios:
        print(f'Enter ship {i+1} location > x y <:')
        tempx, tempy = recebeCoordenada()
        msg = jogador.insereCoordenadas(tempx, tempy)
        if msg!='': print(msg)
        else: i+=1
    jogador.exibeMapaPlayer()
    delay(3)
    limpaTela()

def tiro(atirador:Jogador, alvo:Jogador):
    while True:
        print(f'{atirador.getNome()}, enter hit row/column:')
        tempx, tempy = recebeCoordenada()
        atirou = atirador.atiraEm(alvo, tempx, tempy)

        if atirou:
            break
    
    alvo.exibeMapaGame()

def Ganhador(jogador: Jogador):
    if jogador.ganhou():
        fimGame(jogador)
        return True
    return False

# inicio
def main():
    intro()
    pegaCoordenadas(player1)
    pegaCoordenadas(player2)

    while True:
        tiro(player1, player2)
        if numerosRandomicos: delay()
        if Ganhador(player1): break

        tiro(player2, player1)
        if numerosRandomicos: delay()
        if Ganhador(player2): break

if __name__ == '__main__':
    main()