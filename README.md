# ⚕️**Plataforma Healthcare com Arquitetura de Microserviços em Java**

Objetivo: Desenvolver uma plataforma de healthcare que permita a gestão de pacientes, agendamentos de consultas, prontuários eletrônicos e faturamento. O sistema foi
construído utilizando uma arquitetura de microserviços em Java, utilizando como padrão de projeto a arquitetura de camadas, Controllers, Entidades, Repository, DTO e Services.
 
 **Componentes do Sistema:**
1. Serviço de Gestão de Pacientes:
- Função: Gerenciar os dados dos pacientes.
- Funcionalidades: Registrar, atualizar, remover e listar pacientes;
  
2. Serviço de Agendamento:
- Função: Gerenciar os agendamentos de consultas.
- Funcionalidades: Criar, atualizar, cancelar e listar agendamentos; deve-se incluir um paciente neste agendamento, e verificar se a data e hora escolhida está disponível.

3. Serviço de Prontuário Eletrônico:
- Função: Gerenciar os prontuários eletrônicos dos pacientes.
- Funcionalidades: Adicionar, atualizar, remover e listar registros médicos; trata-se de nome do paciente, registros médicos, data entrada, data alta, convenio etc.

4. Serviço de Prescrições Médicas:
- Função: Gerenciar prescrições de medicamentos.
- Funcionalidades: Criar, atualizar, cancelar e listar prescrições; para cada paciente podem ser prescritos mais de um medicamento.

5. Serviço de Faturamento e Seguradoras:
- Função: Gerenciar o faturamento da conta do paciente
- Funcionalidades: Criar uma conta do paciente, onde terá o registro de todos os materiais, medicamentos e procedimentos utilizados para o paciente. Cada item terá um preço e esse valor
somará ao valor total da conta.

*Tabelas Adicionais:
- Medicamento
- Procedimento
- Material
- Médico
- Convênio

# Autores
| [<img src="https://avatars.githubusercontent.com/u/137840108?v=4" width=115><br><sub>Amanda Kaori</sub>](https://github.com/amandakkm) |  [<img src="https://avatars.githubusercontent.com/u/121531194?v=4" width=115><br><sub>Jonatha de Oliveira</sub>](https://github.com/Jonthaao) | [<img src="https://avatars.githubusercontent.com/u/152339334?v=4" width=115><br><sub>Isadora Borges</sub>](https://github.com/isadoraborgess)  |
| :---: | :---: | :---: |
