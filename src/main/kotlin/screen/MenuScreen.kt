package screen

import java.util.Scanner

abstract class MenuScreen {
    fun runMenu(menuItems: List<Pair<String, () -> Unit>>) {
        while (true) {
            println("\n--- Меню ---")
            menuItems.forEachIndexed { index, (title, _) ->
                println("$index. $title")
            }

            print("\nВыберите пункт: ")
            val input = Scanner(System.`in`).nextLine().trim()  // ⬅ Без try/catch — безопасно

            val choice = input.toIntOrNull()  // ⬅ Без исключения, возвращает null, если не число

            if (choice == null) {
                println("Введите цифру.")
                continue
            }

            if (choice !in menuItems.indices) {
                println("Такого пункта нет. Попробуйте снова.")
                continue
            }

            menuItems[choice].second()
            break
        }
    }
}
