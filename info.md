# Instruction for work with GIT - заголовок высшего уровня
### Git main commands
| Command                        | Description|
|--------------------------------| ----------------------|
| git config --global user.name  | sets developer's name |
| git config --global user.email | sets developer's email, that connects to git| - таблица
* ***git init*** - создаёт локольную папку .git
* **git add** . - добавляет файл/ы для отслеживания изменений
* *git status* - показывает текущие состояние файлов в гите  
\ * - + не нумерованые списки


1. Нумерованый список
* git commit -m "какой-коментарий"
* git log - показывает историю всех комитов
  * git log -p - передостовляет расширеную историю всех коммито 
  * git log --graph - предостовляет историю комиитов в графическом виде
* git checkout - позволяет перемещатся между ветками 
* git branch - показывает все существующие ветки
  * git branch branch_name - содание новой ветки
* git merge branch_name - добавляет исменнения из ветки branch_name в локальную ветку в которой ты находишься
* git push name_of_ripozitory - отправляет данные в удалённый репозиторий
* git branch -d Branch_name - удаляет ветку Branch_name(ты не можешь удалить ветку в которой ты находишься)
* git revert - позволяет отменить последние изменение к последниьу коммиту
* git diff - показывет разницу между тукущим файлом и  тем который в гите 
* git clone - кланирует удаленный репозиторий в локальную директорию(папка)


