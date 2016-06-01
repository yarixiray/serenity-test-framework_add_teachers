Scenario: Checking that the teacher is present on the page
Given the user is on the Our Team page
When the user find teacher <teacher>
Then they should see the name <name> and cource <cource>

Examples:
|teacher|name|cource|
|Марина Мельник|Марина Мельник|Основатель|
|Артем Карпов|Артем Карпов|Автоматизация тестирования ПО|
|Дмитрий Ильченко|Дмитрий Ильченко|Diving into Android Development|
|Михаил Чокан|Михаил Чокан|Руководитель учебного курса|
|Александр Галковский|Александр Галковский|Diving into Java|


