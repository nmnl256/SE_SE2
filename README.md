# SE2
![Java CI](https://github.com/nmnl256/SE_SE2/actions/workflows/testing.yml/badge.svg)


## Описание программы
Программа получает на вход файл, состоящий из чисел.
Программа выводит минимальное, максимальное, сумму чисел и их произведение.

## Использование тестов

В директории src/test/tests находятся готовые тесты:

test1-4.txt - файлы для тестирования корректности работы функций.

speedtest1-4.txt - файлы для проверки длительности работы программы.

wrongtest.txt - файл с неккоректными данными 


![graph](https://github.com/nmnl256/SE_SE2/assets/148970482/80c77dd6-3f95-405d-9a3b-1bbd449f4888)


## Уведомления в Telegram через GitHub Actions
1.Добавить секреты:

Перейдите в настройки репозитория, кликните Secrets and variables -> Actions.
Нажмите New repository secret и добавьте следующие секреты:
TELEGRAM_TOKEN:токен Telegram бота.
TELEGRAM_CHAT_ID: Chat ID, куда вы хотите получать уведомления.(https://telegram.me/myidbot)
## Настройка workflow :

"success": Сообщение, указывающее, что все тесты прошли успешно.
"test failed": Сообщение с отчетом о неудачных тестах
