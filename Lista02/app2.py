# multímetro quebrado
import random
# variaveis
valores = []
soma = 0
desvio = 0

# insere os valores
for x in range(10):
    v = random.random()
    valores.append(v)
    soma+=v

media = soma / len(valores)

print(f"\n\n--- Relatório ---")
for x,v in enumerate(valores):
    print(f"Medição {x+1} : {v:.4f}")
    desvio+= (v-media)**2
print(f"Valor médio das medições: {media:.4f}")
print(f"Desvio padrão: {desvio:.4f}")
msg = "OK" if(desvio > (media*0.1)) else "COM PROBLEMAS"
print("Status do aparelho:", msg)
