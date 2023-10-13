package data;

import java.util.HashMap;

public enum ElementsAndUnClasses {
    TYPES("Типы", new String[]{"Ниндзюцу","Тайдзюцу","Гендзюцу","Додзюцу","Призыв","Генкай",
            "Тота","Мора","Сендзюцу","Марионетка","Телепорт","Медик","Реинк.","Печать","Проклят",
            "Клонир","Запретный","Секретный","Биджу","Кендзюцу","Букидзюцу","Сюрикен","Поглощение",
            "Барьер","Искусство","Звездный","Поток","Групповой","Общий"}),
    WATER("Вода", new String[]{"Дерево", "Лёд", "Шторм", "Сталь", "Пар"}),
    LIGHTNING("Молния", new String[]{"Шторм","Скорость","Магнетизм","Взрыв"}),
    EARTH("Земля", new String[]{ "Дерево", "Кристалл", "Лава", "Пыль", "Тьма", "Сталь", "Магнетизм"}),
    WIND("Ветер", new String[]{"Лёд", "Пыль", "Скорость", "Жар", "Тайфун"}),
    FIRE("Огонь", new String[]{"Лава", "Пыль", "Тьма", "Сталь", "Пламя", "Жар", "Взрыв", "Пар"});

    private final String element;
    private final String[] unclasses;

    ElementsAndUnClasses(String element, String[] unclasses){
    this.element = element;
    this.unclasses = unclasses;
    }

    public String getElement() {
        return element;
        }

    public String[] getUnClasses() {
        return unclasses;
        }

    public static final HashMap<String, String[]> elementAndUnClasses = new HashMap<>();

    static {
        for (ElementsAndUnClasses element : ElementsAndUnClasses.values()) {
            elementAndUnClasses.put(element.getElement(), element.getUnClasses());
            }
        }
}
