package ru.grandi.bambino.rulesofthegame.data.localdata

import ru.grandi.bambino.rulesofthegame.R
import ru.grandi.bambino.rulesofthegame.data.entity.GalleryPhoto
import ru.grandi.bambino.rulesofthegame.data.entity.Player
import ru.grandi.bambino.rulesofthegame.data.entity.RulesGame
import ru.grandi.bambino.rulesofthegame.utils.BASKETBALL
import ru.grandi.bambino.rulesofthegame.utils.FOOTBALL
import ru.grandi.bambino.rulesofthegame.utils.FORMULA_ONE
import ru.grandi.bambino.rulesofthegame.utils.VOLLEYBALL

fun getRulesGameData(typeSport: String): RulesGame {
    return when (typeSport) {
        FOOTBALL -> {
            RulesGame(
                "Футбол",
                "Правило 1: Поле для игры Правило 2: Мяч Правило 3: Число игроков Правило 4: Экипировка игроков Правило 5: Судья Правило 6: Помощники судьи Правило 7: Продолжительность игры Правило 8: Начало и возобновление игры Правило 9: Мяч в игре и не в игре Правило 10: Определение взятия ворот."
            )
        }
        BASKETBALL -> {
            RulesGame(
                "Баскетбод",
                "Основные правила игры в баскетбол: 1. Играть только руками; 2. Пробежки совершаются только с ведением мяча дриблингом; 3. Игра состоит из 4 периодов. Длина периода - 10 минут; 4. На поле одновременно может находиться 5 человек от одной команды; 5. Игроку нельзя находиться без мяча в 3-секундной зоне; 6. Запрещается останавливаться с мячом."
            )
        }
        VOLLEYBALL -> {
            RulesGame(
                "Волейбол",
                "Основные правила волейбола кратко можно описать следующими словами – две команды по 6 игроков играют на одном поле, разделенным сеткой. Побеждает та сторона, которая пропустит меньше мячей на свою половину"
            )
        }
        FORMULA_ONE -> {
            RulesGame(
                "Формула 1",
                "Правила Формулы 1 позволяют остановить Гран-При. Если гонку нужно приостановить, светофор загорается красным светом, маршалы выставляют красные флаги и выезд из пит-лейна блокируется."
            )
        }
        else -> {
            throw Throwable("could non find sport")
        }
    }
}

fun getPlayersData(typeSport: String): List<Player> {
    return when (typeSport) {
        FOOTBALL -> {
            listOf(
                Player(
                    "Килиан Мбаппе Лотте́н",
                    "Футболист",
                    R.drawable.mbappe
                ),
                Player(
                    "Роберт Левандовски",
                    "Футболист",
                    R.drawable.lewandowski
                ),Player(
                    "Неймар",
                    "Футболист",
                    R.drawable.neymar
                ),Player(
                    "Ярослав Ракицкий",
                    "Футболист",
                    R.drawable.rakitskiy
                ),Player(
                    "Алексе́й Миранчу́к",
                    "Футболист",
                    R.drawable.miranchuk
                ),Player(
                    "Андрей Аршавин",
                    "Футболист",
                    R.drawable.arshavin
                ),Player(
                    "Алекса́ндр Коко́рин",
                    "Футболист",
                    R.drawable.kokorin
                ),Player(
                    "Лионе́ль Ме́сси",
                    "Футболист",
                    R.drawable.messi
                ),Player(
                    "Криштиа́ну Рона́лду",
                    "Футболист",
                    R.drawable.ronaldu
                ),Player(
                    "Рона́лду Море́йра",
                    "Футболист",
                    R.drawable.ronaldinio
                ),
            )
        }
        BASKETBALL -> {
            listOf(
                Player(
                   "КАРЛ-ЭНТОНИ ТАУНС",
                   "Баскетболист",
                    R.drawable.tauns
                ),
                Player(
                    "РАССЕЛЛ УЭСТБРУК",
                    "Баскетболист",
                    R.drawable.uastbruk
                ),
                Player(
                    "ДРЭЙМОНД ГРИН",
                    "Баскетболист",
                    R.drawable.grin
                ),
                Player(
                    "КАЙРИ ИРВИНГ",
                    "Баскетболист",
                    R.drawable.irving
                ),
                Player(
                    "ЯННИС АДЕТОКУНБО",
                    "Баскетболист",
                    R.drawable.adetokunbo
                ),
                Player(
                    "ЭНТОНИ ДЭВИС",
                    "Баскетболист",
                    R.drawable.davis
                ),
                Player(
                    "ДЖЕЙМС ХАРДЕН",
                    "Баскетболист",
                    R.drawable.harden
                ),
                Player(
                    "СТЕФЕН КАРРИ",
                    "Баскетболист",
                    R.drawable.karry
                ),
                Player(
                    "КЕВИН ДЮРАНТ",
                    "Баскетболист",
                    R.drawable.durant
                ),
                Player(
                    "ЛЕБРОН ДЖЕЙМС",
                    "Баскетболист",
                    R.drawable.djems
                ),
            )
        }
        VOLLEYBALL -> {
            listOf(
                Player(
                    "Шашкова Любовь Владимировна",
                    "Волейболист",
                    R.drawable.shashkova
                ),
                Player(
                    "Максим Михайлов",
                    "Волейболист",
                    R.drawable.mihaylov
                ),
                Player(
                    "Ольга Фатеева",
                    "Волейболист",
                    R.drawable.fateeva
                ),
                Player(
                    "Рэйд Придди",
                    "Волейболист",
                    R.drawable.priddy
                ),
                Player(
                    "Ллой Болл",
                    "Волейболист",
                    R.drawable.boll
                ),
                Player(
                    "Грбич Владимир",
                    "Волейболист",
                    R.drawable.grbich
                ),
                Player(
                    "Данте Амарал",
                    "Волейболист",
                    R.drawable.amaral
                ),
                Player(
                    "Шопс Йохан",
                    "Волейболист",
                    R.drawable.shops
                )
            )
        }
        FORMULA_ONE -> {
            listOf(
                Player(
                    "Рубенс Баррикелло",
                    "Пилот формулы 1",
                    R.drawable.barrikello
                ),
                Player(
                    "Даниэль Риккардо",
                    "Пилот формулы 1",
                    R.drawable.rikkardo
                ),
                Player(
                    "Хуан-Пабло Монтойя",
                    "Пилот формулы 1",
                    R.drawable.montoya
                ),
                Player(
                    "Нико Росберг",
                    "Пилот формулы 1",
                    R.drawable.rosberg
                ),
                Player(
                    "Дженсон Баттон",
                    "Пилот формулы 1",
                    R.drawable.batton
                ),
                Player(
                    "Кими Райкконен",
                    "Пилот формулы 1",
                    R.drawable.raykkonen
                ),
                Player(
                    "Льюис Хэмилтон",
                    "Пилот формулы 1",
                    R.drawable.hamilton
                ),
                Player(
                    "Себастьян Феттель",
                    "Пилот формулы 1",
                    R.drawable.fettel
                ),
                Player(
                    "Фернандо Алонсо",
                    "Пилот формулы 1",
                    R.drawable.alonso
                ),
                Player(
                    "Михаэль Шумахер",
                    "Пилот формулы 1",
                    R.drawable.shumaher
                ),
            )
        }
        else -> {
            throw Throwable("could non find sport")
        }
    }
}

fun getGalleryPhotoData(typeSport: String): List<GalleryPhoto> {
    return when (typeSport) {
        FOOTBALL -> {
            listOf(
                GalleryPhoto(R.drawable.football1),
                GalleryPhoto(R.drawable.football2),
                GalleryPhoto(R.drawable.football3),
                GalleryPhoto(R.drawable.football4),
                GalleryPhoto(R.drawable.football5),
                GalleryPhoto(R.drawable.football6),
                GalleryPhoto(R.drawable.football7),
                GalleryPhoto(R.drawable.football8),
                GalleryPhoto(R.drawable.football9),
                GalleryPhoto(R.drawable.football10),
            )
        }
        BASKETBALL -> {
            listOf(
                GalleryPhoto(R.drawable.basket1),
                GalleryPhoto(R.drawable.basket2),
                GalleryPhoto(R.drawable.basket3),
                GalleryPhoto(R.drawable.basket4),
                GalleryPhoto(R.drawable.basket5),
                GalleryPhoto(R.drawable.basket6),
                GalleryPhoto(R.drawable.basket7),
                GalleryPhoto(R.drawable.basket8),
                GalleryPhoto(R.drawable.basket9),
                GalleryPhoto(R.drawable.basket10)
            )
        }
        VOLLEYBALL -> {
            listOf(
                GalleryPhoto(R.drawable.vole1),
                GalleryPhoto(R.drawable.vole2),
                GalleryPhoto(R.drawable.vole3),
                GalleryPhoto(R.drawable.vole4),
                GalleryPhoto(R.drawable.vole5),
                GalleryPhoto(R.drawable.vole6),
                GalleryPhoto(R.drawable.vole7),
                GalleryPhoto(R.drawable.vole8),
                GalleryPhoto(R.drawable.vole9),
                GalleryPhoto(R.drawable.vole10)
            )
        }
        FORMULA_ONE -> {
            listOf(
                GalleryPhoto(R.drawable.formula1),
                GalleryPhoto(R.drawable.formula2),
                GalleryPhoto(R.drawable.formula3),
                GalleryPhoto(R.drawable.formula4),
                GalleryPhoto(R.drawable.formula5),
                GalleryPhoto(R.drawable.formula6),
                GalleryPhoto(R.drawable.formula7),
                GalleryPhoto(R.drawable.formula8),
                GalleryPhoto(R.drawable.formula9),
                GalleryPhoto(R.drawable.formula10)
            )
        }
        else -> {
            throw Throwable("could non find sport")
        }
    }
}