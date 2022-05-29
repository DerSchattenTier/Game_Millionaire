package com.nemez.myapplication.millionaire2;

import java.util.ArrayList;

public class ArrayOfQuestions {

    //Создание вопросов. Коллекция внизу.
    //При создании новых вопросов: добавить в коллекцию и увеличить ограничение Рандома в Game.java.
    //(Выставить значение quantity: qX + 1)

    Question q0 = new Question(
            "Какими должны быть волки, чтоб овцы были целы?",
            "Беззубыми",
            "Ленивыми",
            "Сытыми",
            "Вегетарианцами",
            false,
            false,
            true,
            false);

    Question q1 = new Question(
            "Какая птица приносит детей?",
            "Курица",
            "Аист",
            "Дятел",
            "Какаду",
            false,
            true,
            false,
            false);

    Question q2 = new Question(
            "На каких играх дисквалифицируют за допинг?",
            "Олимпийских",
            "Любовных",
            "Азартных",
            "Дипломатических",
            true,
            false,
            false,
            false);

    Question q3 = new Question(
            "Как называют людей, купающихся зимой в проруби?",
            "Отморозки",
            "Зимородки",
            "Тюлени",
            "Моржи",
            false,
            false,
            false,
            true);

    Question q4 = new Question(
            "Какое сельхоз орудие служит атрибутом смерти?",
            "Топор",
            "Секатор",
            "Электродоилка",
            "Коса",
            false,
            false,
            false,
            true);

    Question q5 = new Question(
            "Что вырубал из скалы Данила-мастер?",
            "Каменное сердце",
            "Каменный уголь",
            "Каменную бабу",
            "Каменный цветок",
            false,
            false,
            false,
            true);

    Question q6 = new Question(
            "Что написано на дверях вагонов метро?",
            "Дверью не хлопать",
            "Не прислоняться",
            "Служебный вход",
            "Туалет",
            false,
            true,
            false,
            false);

    Question q7 = new Question(
            "Какой период начинается после свадьбы?",
            "Мёртвый сезон",
            "Санитарный день",
            "Медовый месяц",
            "Тихий час",
            false,
            false,
            true,
            false);

    Question q8 = new Question(
            "Кого позвали на помощь дедка с бабкой?",
            "Жучку",
            "Мышку",
            "Внучку",
            "Кошку",
            false,
            false,
            true,
            false);

    Question q9 = new Question(
            "Что обещал съесть Укупник?",
            "Тёщу",
            "Паспорт",
            "Цветы",
            "Кольца",
            false,
            true,
            false,
            false);

    Question q10 = new Question(
            "Что потерял ослик Иа?",
            "Нюх",
            "Зубы",
            "Хвост",
            "Совесть",
            false,
            false,
            true,
            false);

    Question q11 = new Question(
            "Сколько будет три в кубе?",
            "9",
            "18",
            "27",
            "81",
            false,
            false,
            true,
            false);

    Question q12 = new Question(
            "Какое яйцо снесла курочка ряба?",
            "Киндер",
            "Фаберже",
            "Золотое",
            "Дедушкино",
            false,
            false,
            true,
            false);

    Question q13 = new Question(
            "Что купила муха на базаре?",
            "Самовар",
            "Самогон",
            "Комара",
            "Канделябр",
            true,
            false,
            false,
            false);

    Question q14 = new Question(
            "Чем обычно посыпают городские улицы в гололёд?",
            "Солью",
            "Перцем",
            "Проклятиями",
            "Пеплом",
            true,
            false,
            false,
            false);

    Question q15 = new Question(
            "Кто построил самую большую пирамиду?",
            "Мавроди",
            "Рамзес",
            "Хеопс",
            "Хефрен",
            false,
            false,
            true,
            false);

    Question q16 = new Question(
            "Что не меняется от перемены мест слагаемых?",
            "Темпы",
            "Эффективность",
            "Сумма",
            "Ничего",
            false,
            false,
            true,
            false);

    Question q17 = new Question(
            "Что такое каламбур?",
            "Детская игра",
            "Игра слов",
            "Анекдот",
            "Смешная ситуация",
            false,
            true,
            false,
            false);

    Question q18 = new Question(
            "Чем отличается птица Говорун?",
            "Умом и сообразительностью",
            "Болтливостью",
            "Смекалкой",
            "Глупостью и тупостью",
            true,
            false,
            false,
            false);

    Question q19 = new Question(
            "Что, согласно поговорке, открывается легко?",
            "Рот",
            "Закон Ньютона",
            "Бутылка",
            "Ларчик",
            false,
            false,
            false,
            true);

    Question q20 = new Question(
            "Какая из этих шахматных фигур не может сделать ход на соседнюю клетку?",
            "Слон",
            "Ферзь",
            "Ладья",
            "Конь",
            false,
            false,
            false,
            true);

    Question q21 = new Question(
            "Изучение соединений какого элемента является основой органической химии?",
            "Кислород",
            "Железо",
            "Водород",
            "Углерод",
            false,
            false,
            false,
            true);

    Question q22 = new Question(
            "Как назывался верховный орган власти в Древнем Риме?",
            "Синод",
            "Сенат",
            "Дума",
            "Совет",
            false,
            true,
            false,
            false);

    Question q23 = new Question(
            "В какой области не присуждают Нобелевскую премию?",
            "Физика",
            "Химия",
            "Математика",
            "Литература",
            false,
            false,
            true,
            false);

    Question q24 = new Question(
            "Чей дом сгорел в детской сказке С. Я. Маршака?",
            "Жучкин",
            "Бабкин",
            "Кошкин",
            "Мышкин",
            false,
            false,
            true,
            false);

    Question q25 = new Question(
            "Чем были скреплены перья на крыльях мифологического героя Икара?",
            "Смолой",
            "Воском",
            "Мёдом",
            "Клеем",
            false,
            true,
            false,
            false);

    Question q26 = new Question(
            "Какой газ в атмосфере Земли защищает живые организмы от вредных излучений?",
            "Кислород",
            "Гелий",
            "Озон",
            "Азот",
            false,
            false,
            true,
            false);

    Question q27 = new Question(
            "Столица Великобритании",
            "Париж",
            "Берлин",
            "Лондон",
            "Москва",
            false,
            false,
            true,
            false);

    Question q28 = new Question(
            "Кто из актёров кукольного театра Карабаса Барабаса сочинял стихи?",
            "Мальвина",
            "Артемон",
            "Пьеро",
            "Буратино",
            false,
            false,
            true,
            false);

    Question q29 = new Question(
            "Без чего невозможно играть в орлянку?",
            "Монеты",
            "Спичек",
            "Карт",
            "Шахматной доски",
            true,
            false,
            false,
            false);

    Question q30 = new Question(
            "В какой рыбе герои романа \"Дети капитана Гранта\" нашли бутылку с посланием?",
            "Молот",
            "Пила",
            "Меч",
            "Игла",
            true,
            false,
            false,
            false);

    Question q31 = new Question(
            "Какое из этих животных не пятнистое?",
            "Гепард",
            "Сервал",
            "Пума",
            "Леопард",
            false,
            false,
            true,
            false);

    Question q32 = new Question(
            "Какое перо чаще всего использовали в старину для письма?",
            "Гусиное",
            "Утиное",
            "Куриное",
            "Страусиное",
            true,
            false,
            false,
            false);

    Question q33 = new Question(
            "Сколько стран входит в состав Великобритании??",
            "4",
            "3",
            "5",
            "6",
            true,
            false,
            false,
            false);

    Question q34 = new Question(
            "Какой стране принадлежат Канарские острова?",
            "Беларусь",
            "Эквадор",
            "Италия",
            "Испания",
            false,
            false,
            false,
            true);

    Question q35 = new Question(
            "Валюта узбекистана",
            "Йена",
            "Тугрик",
            "Тенге",
            "Сум",
            false,
            false,
            false,
            true);

    Question q36 = new Question(
            "В честь чего был назван компьютер компании Макинтош?",
            "Плащ",
            "Сорт яблок",
            "Язык программирования",
            "Имя создателя",
            false,
            true,
            false,
            false);

    Question q37 = new Question(
            "Что коллекционирует филуменист?",
            "Солдатиков",
            "Марки",
            "Спичечные коробки",
            "Пивные пробки",
            false,
            false,
            true,
            false);

    Question q38 = new Question(
            "Как называется острая мексиканская приправа?",
            "Сациви",
            "Лечо",
            "Чили",
            "Аджика",
            false,
            false,
            true,
            false);

    Question q39 = new Question(
            "Какая масть является самой старшей при игре в преферанс?",
            "Бубны",
            "Червы",
            "Трефы",
            "Пики",
            false,
            true,
            false,
            false);

    Question q40 = new Question(
            "Как называется боязнь глубины?",
            "Батофобия",
            "Гидрофобия",
            "Таласофобия",
            "Гидрофобия",
            true,
            false,
            false,
            false);

    //Коллекция

    ArrayList<Question> array = new ArrayList<Question>(){{
        add(q0);
        add(q1);
        add(q2);
        add(q3);
        add(q4);
        add(q5);
        add(q6);
        add(q7);
        add(q8);
        add(q9);
        add(q10);
        add(q11);
        add(q12);
        add(q13);
        add(q14);
        add(q15);
        add(q16);
        add(q17);
        add(q18);
        add(q19);
        add(q20);
        add(q21);
        add(q22);
        add(q23);
        add(q24);
        add(q25);
        add(q26);
        add(q27);
        add(q28);
        add(q29);
        add(q30);
        add(q31);
        add(q32);
        add(q33);
        add(q34);
        add(q35);
        add(q36);
        add(q37);
        add(q38);
        add(q39);
        add(q40);
    }};
}



