package com.example.fitnesstraining

class ExerciseDataBase {
    companion object {
        val exercises = mutableListOf(
            Exercise(
                "Скручивания",
                "лежим на спине, ноги согнуты в коленях и расставлены на ширине плеч (или чуть шире). " +
                        "Руки на затылке легко придерживают голову, немного соприкасаясь с пальцами: никаких рук " +
                        "в замке и давления на затылок быть не должно, локти всегда раскрыты. Из исходного положения " +
                        "поднимаем верхнюю часть корпуса и немного тянемся к коленям.",
                30,
                R.drawable.twisting
            ),
            Exercise(
                "Скручивания 2",
                "при подъеме мы поочередно выпрямляем то одну, то другую ногу и пальцами рук тянемся к ее пятке. " +
                        "Ногу выпрямляем насколько можем. При желании можете сначала сделать подъемы с одной ногой, а " +
                        "потом с другой вместо чередования.",
                30,
                R.drawable.twisting_2
            ),
            Exercise(
                "Косые скручивания",
                "при подъеме поочередно тянемся локтями как бы за колено противоположной ноги: правая рука – левая нога.",
                30,
                R.drawable.oblique_twists
            ),
            Exercise(
                "Косые скручивания 2",
                "при подъеме одного плеча заводим локоть за колено противоположной ноги, а при спуске эту ногу " +
                        "выпрямляем и держим параллельно полу, не касаясь его.",
                30,
                R.drawable.oblique_twists_2
            ),
            Exercise(
                "Косые скручивания 3",
                "обе ноги все время на весу, и притягиваем мы их к корпусу поочередно.",
                30,
                R.drawable.oblique_twists_3
            ),
            Exercise(
                "Ноги вверх",
                "ноги выпрямлены и направлены на потолок, носки при этом тянем на себя. " +
                        "При подъёме руками тянемся к пяткам, голову держим прямо, шею не сгибаем.",
            30,
                R.drawable.legs_up
            ),
            Exercise(
                "Ноги вверх 2",
                "мы не поднимаем корпус, а поочередно опускаем ноги. Лопатки и поясница прижаты к коврику. ",
                30,
                R.drawable.legs_up_2
            ),
            Exercise(
                "Ноги вверх 3",
                "Руки держим не за головой, а вдоль корпуса, чтобы стабилизировать тело. Лопатки опущены и " +
                        "прижаты к полу. Подъем происходит за счет мышц живота. На пол таз опускаем очень аккуратно, не " +
                        "должно быть никаких бросков.",
                30,
                R.drawable.legs_up_3
            ),
            Exercise(
                "Книжка",
                "руками упираемся в пол, корпус держим ровно и немного отклоняемся назад. Ноги сгибаем в коленях " +
                        "и отрываем от пола, держим их под тем же углом, что и верхнюю часть тела. Спина всегда остается прямой, " +
                        "шею сильно не сгибаем. Плечи держим ровно, не пытаемся вывернуть их внутрь. На выдохе выпрямляем ноги " +
                        "и отклоняемся корпусом, образовывая с полом угол 45 градусов. На вдохе тянем корпус и колени друг к другу. " +
                        "Сильный упор на руки не делаем: опускать и поднимать вас должна прямая мышца живота.",
                30,
                R.drawable.book
            ),
            Exercise(
                "Книжка 2",
                "Задействуем косые мышцы. Делаем все то же самое, но плечами поочередно тянемся в противоположную сторону, будто за колени.",
                30,
                R.drawable.book_2
            )


        )
    }
}