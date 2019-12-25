package by.carkva_gazeta.resources;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;

import androidx.core.content.ContextCompat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import by.carkva_gazeta.malitounik.MainActivity;
import by.carkva_gazeta.malitounik.SettingsActivity;
import by.carkva_gazeta.malitounik.TextView_Roboto_Condensed;

/**
 * Created by oleg on 18.10.16
 */

class Paralelnye_mesta {

    private InputStream inputStream;

    @SuppressWarnings("ConstantConditions")
    ArrayList<TextView_Roboto_Condensed> paralel(Context context, String cytanneSours, String cytanneParalelnye, boolean semuxa) {
        ArrayList<TextView_Roboto_Condensed> arrayList = new ArrayList<>();
        TextView_Roboto_Condensed textViewSours, textViewZag, textViewOpis;
        if (semuxa) {
            if (cytanneSours.contains("Быт")) {
                cytanneSours = cytanneSours.replace("Быт", "Быц");
            }
            if (cytanneSours.contains("Исх")) {
                cytanneSours = cytanneSours.replace("Исх", "Вых");
            }
            if (cytanneSours.contains("Лев")) {
                cytanneSours = cytanneSours.replace("Лев", "Ляв");
            }
            if (cytanneSours.contains("Числа")) {
                cytanneSours = cytanneSours.replace("Числа", "Лікі");
            }
            if (cytanneSours.contains("Втор")) {
                cytanneSours = cytanneSours.replace("Втор", "Др.Зак");
            }
            if (cytanneSours.contains("Руфь")) {
                cytanneSours = cytanneSours.replace("Руфь", "Рут");
            }
            if (cytanneSours.contains("1 Пар")) {
                cytanneSours = cytanneSours.replace("1 Пар", "1 Лет");
            }
            if (cytanneSours.contains("2 Пар")) {
                cytanneSours = cytanneSours.replace("2 Пар", "2 Лет");
            }
            if (cytanneSours.contains("1 Езд")) {
                cytanneSours = cytanneSours.replace("1 Езд", "Эзд");
            }
            if (cytanneSours.contains("Неем")) {
                cytanneSours = cytanneSours.replace("Неем", "Нээм");
            }
            if (cytanneSours.contains("Есф")) {
                cytanneSours = cytanneSours.replace("Есф", "Эст");
            }
            if (cytanneSours.contains("Иов")) {
                cytanneSours = cytanneSours.replace("Иов", "Ёва");
            }
            if (cytanneSours.contains("Притч")) {
                cytanneSours = cytanneSours.replace("Притч", "Высл");
            }
            if (cytanneSours.contains("Еккл")) {
                cytanneSours = cytanneSours.replace("Еккл", "Экл");
            }
            if (cytanneSours.contains("Песн")) {
                cytanneSours = cytanneSours.replace("Песн", "Найв");
            }
            if (cytanneSours.contains("Ис") && !cytanneSours.contains("Исх")) {
                cytanneSours = cytanneSours.replace("Ис", "Іс");
            }
            if (cytanneSours.contains("Иер")) {
                cytanneSours = cytanneSours.replace("Иер", "Ер");
            }
            if (cytanneSours.contains("Плач Иер")) {
                cytanneSours = cytanneSours.replace("Плач Иер", "Ер Плач");
            }
            if (cytanneSours.contains("Иез")) {
                cytanneSours = cytanneSours.replace("Иез", "Езэ");
            }
            if (cytanneSours.contains("Ос")) {
                cytanneSours = cytanneSours.replace("Ос", "Ас");
            }
            if (cytanneSours.contains("Иоиль")) {
                cytanneSours = cytanneSours.replace("Иоиль", "Ёіля");
            }
            if (cytanneSours.contains("Авдий")) {
                cytanneSours = cytanneSours.replace("Авдий", "Аўдзея");
            }
            if (cytanneSours.contains("Иона")) {
                cytanneSours = cytanneSours.replace("Иона", "Ёны");
            }
            if (cytanneSours.contains("Мих")) {
                cytanneSours = cytanneSours.replace("Мих", "Міх");
            }
            if (cytanneSours.contains("Наум")) {
                cytanneSours = cytanneSours.replace("Наум", "Нав");
            }
            if (cytanneSours.contains("Аввакум")) {
                cytanneSours = cytanneSours.replace("Аввакум", "Абакума");
            }
            if (cytanneSours.contains("Сафония")) {
                cytanneSours = cytanneSours.replace("Сафония", "Сафона");
            }
            if (cytanneSours.contains("Аггей")) {
                cytanneSours = cytanneSours.replace("Аггей", "Агея");
            }
            if (cytanneSours.contains("Мф")) {
                cytanneSours = cytanneSours.replace("Мф", "Мц");
            }
            if (cytanneSours.contains("Ин")) {
                cytanneSours = cytanneSours.replace("Ин", "Ян");
            }
            if (cytanneSours.contains("Деян")) {
                cytanneSours = cytanneSours.replace("Деян", "Дзеі");
            }
            if (cytanneSours.contains("Иак")) {
                cytanneSours = cytanneSours.replace("Иак", "Якав");
            }
            if (cytanneSours.contains("1 Пет")) {
                cytanneSours = cytanneSours.replace("1 Пет", "1 Пятр");
            }
            if (cytanneSours.contains("2 Пет")) {
                cytanneSours = cytanneSours.replace("2 Пет", "2 Пятр");
            }
            if (cytanneSours.contains("1 Ин")) {
                cytanneSours = cytanneSours.replace("1 Ин", "1 Ян");
            }
            if (cytanneSours.contains("2 Ин")) {
                cytanneSours = cytanneSours.replace("2 Ин", "2 Ян");
            }
            if (cytanneSours.contains("3 Ин")) {
                cytanneSours = cytanneSours.replace("3 Ин", "3 Ян");
            }
            if (cytanneSours.contains("Иуды")) {
                cytanneSours = cytanneSours.replace("Иуды", "Юды");
            }
            if (cytanneSours.contains("Рим")) {
                cytanneSours = cytanneSours.replace("Рим", "Рым");
            }
            if (cytanneSours.contains("1 Кор")) {
                cytanneSours = cytanneSours.replace("1 Кор", "1 Кар");
            }
            if (cytanneSours.contains("2 Кор")) {
                cytanneSours = cytanneSours.replace("2 Кор", "2 Кар");
            }
            if (cytanneSours.contains("Флп")) {
                cytanneSours = cytanneSours.replace("Флп", "Піл");
            }
            if (cytanneSours.contains("Кол")) {
                cytanneSours = cytanneSours.replace("Кол", "Кал");
            }
            if (cytanneSours.contains("1 Тим")) {
                cytanneSours = cytanneSours.replace("1 Тим", "1 Цім");
            }
            if (cytanneSours.contains("2 Тим")) {
                cytanneSours = cytanneSours.replace("2 Тим", "2 Цім");
            }
            if (cytanneSours.contains("Тит")) {
                cytanneSours = cytanneSours.replace("Тит", "Ціт");
            }
            if (cytanneSours.contains("Флм")) {
                cytanneSours = cytanneSours.replace("Флм", "Філ");
            }
            if (cytanneSours.contains("Евр")) {
                cytanneSours = cytanneSours.replace("Евр", "Габ");
            }
            if (cytanneSours.contains("Откр")) {
                cytanneSours = cytanneSours.replace("Откр", "Адкр");
            }
        }

        String nazva = "Бытие", nazvaBel = "Быцьцё";
        int nomer = 1;
        String[] chten = cytanneParalelnye.split(";");

        textViewSours = new TextView_Roboto_Condensed(context);
        textViewSours.setTextIsSelectable(true);
        textViewSours.setTypeface(null, Typeface.BOLD_ITALIC);
        textViewSours.setPadding(0, 0, 0, 10);
        SharedPreferences k = context.getSharedPreferences("biblia", Context.MODE_PRIVATE);
        float fontBiblia = k.getInt("font_malitounik", SettingsActivity.GET_DEFAULT_FONT_SIZE);
        boolean dzenNoch = k.getBoolean("dzen_noch", false);
        if (dzenNoch) {
            textViewSours.setTextColor(ContextCompat.getColor(context, by.carkva_gazeta.malitounik.R.color.colorIcons));
        } else {
            textViewSours.setTextColor(ContextCompat.getColor(context, by.carkva_gazeta.malitounik.R.color.colorPrimary_text));
        }
        textViewSours.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontBiblia);
        textViewSours.setText(context.getResources().getString(by.carkva_gazeta.malitounik.R.string.paralel_smoll, cytanneSours));
        arrayList.add(textViewSours);

        for (String aChten : chten) {
            int nomerglavy = 1;
            String fit = aChten.trim(), nachalo, konec;
            if (fit.contains("Быт")) {
                nazva = "Бытие";
                nazvaBel = "Быцьцё";
                nomer = 1;
            }
            if (fit.contains("Исх")) {
                nazva = "Исход";
                nazvaBel = "Выхад";
                nomer = 2;
            }
            if (fit.contains("Лев")) {
                nazva = "Левит";
                nazvaBel = "Лявіт";
                nomer = 3;
            }
            if (fit.contains("Чис")) {
                nazva = "Числа";
                nazvaBel = "Лікі";
                nomer = 4;
            }
            if (fit.contains("Втор")) {
                nazva = "Второзаконие";
                nazvaBel = "Другі Закон";
                nomer = 5;
            }
            if (fit.contains("Нав")) {
                nazva = "Иисуса Навина";
                nazvaBel = "Ісуса сына Нава";
                nomer = 6;
            }
            if (fit.contains("Суд")) {
                nazva = "Судей израилевых";
                nazvaBel = "Судзьдзяў";
                nomer = 7;
            }
            if (fit.contains("Руфь")) {
                nazva = "Руфи";
                nazvaBel = "Рут";
                nomer = 8;
            }
            if (fit.contains("1 Цар")) {
                nazva = "1-я Царств";
                nazvaBel = "1-я Царстваў";
                nomer = 9;
            }
            if (fit.contains("2 Цар")) {
                nazva = "2-я Царств";
                nazvaBel = "2-я Царстваў";
                nomer = 10;
            }
            if (fit.contains("3 Цар")) {
                nazva = "3-я Царств";
                nazvaBel = "3-я Царстваў";
                nomer = 11;
            }
            if (fit.contains("4 Цар")) {
                nazva = "4-я Царств";
                nazvaBel = "4-я Царстваў";
                nomer = 12;
            }
            if (fit.contains("1 Пар")) {
                nazva = "1-я Паралипоменон";
                nazvaBel = "1-я Летапісаў";
                nomer = 13;
            }
            if (fit.contains("2 Пар")) {
                nazva = "1-я Паралипоменон";
                nazvaBel = "2-я Летапісаў";
                nomer = 14;
            }
            if (fit.contains("1 Езд")) {
                nazva = "1-я Ездры";
                nazvaBel = "Эздры";
                nomer = 15;
            }
            if (fit.contains("Неем")) {
                nazva = "Неемии";
                nazvaBel = "Нээміі";
                nomer = 16;
            }
            if (fit.contains("2 Езд")) {
                nazva = "2-я Ездры";
                nazvaBel = "";
                nomer = 17;
            }
            if (fit.contains("Тов")) {
                nazva = "Товита";
                nazvaBel = "";
                nomer = 18;
            }
            if (fit.contains("Иудифь")) {
                nazva = "Иудифи";
                nazvaBel = "";
                nomer = 19;
            }
            if (fit.contains("Есф")) {
                nazva = "Есфири";
                nazvaBel = "Эстэр";
                nomer = 20;
            }
            if (fit.contains("Иов")) {
                nazva = "Иова";
                nazvaBel = "Ёва";
                nomer = 21;
            }
            if (fit.contains("Пс")) {
                nazva = "Псалтирь";
                nazvaBel = "Псалтыр";
                nomer = 22;
            }
            if (fit.contains("Притч")) {
                nazva = "Притчи Соломона";
                nazvaBel = "Выслоўяў Саламонавых";
                nomer = 23;
            }
            if (fit.contains("Еккл")) {
                nazva = "Екклезнаста";
                nazvaBel = "Эклезіяста";
                nomer = 24;
            }
            if (fit.contains("Песн")) {
                nazva = "Песнь песней Соломона";
                nazvaBel = "Найвышэйшая Песьня Саламонава";
                nomer = 25;
            }
            if (fit.contains("Прем")) {
                nazva = "Премудрости Соломона";
                nazvaBel = "";
                nomer = 26;
            }
            if (fit.contains("Сир")) {
                nazva = "Премудрости Иисуса, сына Сирахова";
                nazvaBel = "";
                nomer = 27;
            }
            if (fit.contains("Ис") && !fit.contains("Исх")) {
                nazva = "Исаии";
                nazvaBel = "Ісаі";
                nomer = 28;
            }
            if (fit.contains("Иер")) {
                nazva = "Иеремии";
                nazvaBel = "Ераміі";
                nomer = 29;
            }
            if (fit.contains("Плач")) {
                nazva = "Плач Иеремии";
                nazvaBel = "Ераміін Плач";
                nomer = 30;
            }
            if (fit.contains("Посл Иер")) {
                nazva = "Послание Иеремии";
                nazvaBel = "";
                nomer = 31;
            }
            if (fit.contains("Вар")) {
                nazva = "Варуха";
                nazvaBel = "";
                nomer = 32;
            }
            if (fit.contains("Иез")) {
                nazva = "Иезекииля";
                nazvaBel = "Езэкііля";
                nomer = 33;
            }
            if (fit.contains("Дан")) {
                nazva = "Даниила";
                nazvaBel = "Данііла";
                nomer = 34;
            }
            if (fit.contains("Ос")) {
                nazva = "Осии";
                nazvaBel = "Асіі";
                nomer = 35;
            }
            if (fit.contains("Иоил")) {
                nazva = "Иоиля";
                nazvaBel = "Ёіля";
                nomer = 36;
            }
            if (fit.contains("Ам")) {
                nazva = "Амоса";
                nazvaBel = "Амоса";
                nomer = 37;
            }
            if (fit.contains("Авд")) {
                nazva = "Авдия";
                nazvaBel = "Аўдзея";
                nomer = 38;
            }
            if (fit.contains("Иона")) {
                nazva = "Ионы";
                nazvaBel = "Ёны";
                nomer = 39;
            }
            if (fit.contains("Мих")) {
                nazva = "Михея";
                nazvaBel = "Міхея";
                nomer = 40;
            }
            if (fit.contains("Наум")) {
                nazva = "Наума";
                nazvaBel = "Навума";
                nomer = 41;
            }
            if (fit.contains("Авв")) {
                nazva = "Аввакума";
                nazvaBel = "Абакума";
                nomer = 42;
            }
            if (fit.contains("Соф")) {
                nazva = "Софонии";
                nazvaBel = "Сафона";
                nomer = 43;
            }
            if (fit.contains("Агг")) {
                nazva = "Аггея";
                nazvaBel = "Агея";
                nomer = 44;
            }
            if (fit.contains("Зах")) {
                nazva = "Захарии";
                nazvaBel = "Захарыі";
                nomer = 45;
            }
            if (fit.contains("Мал")) {
                nazva = "Малахии";
                nazvaBel = "Малахіі";
                nomer = 46;
            }
            if (fit.contains("1 Мак")) {
                nazva = "1-я Маккавейская";
                nazvaBel = "";
                nomer = 47;
            }
            if (fit.contains("2 Мак")) {
                nazva = "2-я Маккавейская";
                nazvaBel = "";
                nomer = 48;
            }
            if (fit.contains("3 Мак")) {
                nazva = "3-я Маккавейская";
                nazvaBel = "";
                nomer = 49;
            }
            if (fit.contains("3 Езд")) {
                nazva = "3-я Ездры";
                nazvaBel = "";
                nomer = 50;
            }
            if (fit.contains("Мф")) {
                nazva = "От Матфея";
                nazvaBel = "Паводле Мацьвея";
                nomer = 51;
            }
            if (fit.contains("Мк")) {
                nazva = "От Марка";
                nazvaBel = "Паводле Марка";
                nomer = 52;
            }
            if (fit.contains("Лк")) {
                nazva = "От Луки";
                nazvaBel = "Паводле Лукаша";
                nomer = 53;
            }
            if (fit.contains("Ин")) {
                nazva = "От Иоанна";
                nazvaBel = "Паводле Яна";
                nomer = 54;
            }
            if (fit.contains("Деян")) {
                nazva = "Деяния святых апостолов";
                nazvaBel = "Дзеі Апосталаў";
                nomer = 55;
            }
            if (fit.contains("Иак")) {
                nazva = "Иакова";
                nazvaBel = "Якава";
                nomer = 56;
            }
            if (fit.contains("1 Пет")) {
                nazva = "1-е Петра";
                nazvaBel = "1-е Пятра";
                nomer = 57;
            }
            if (fit.contains("2 Пет")) {
                nazva = "2-е Петра";
                nazvaBel = "2-е Пятра";
                nomer = 58;
            }
            if (fit.contains("1 Ин")) {
                nazva = "1-е Иоанна";
                nazvaBel = "1-е Яна Багаслова";
                nomer = 59;
            }
            if (fit.contains("2 Ин")) {
                nazva = "2-е Иоанна";
                nazvaBel = "2-е Яна Багаслова";
                nomer = 60;
            }
            if (fit.contains("3 Ин")) {
                nazva = "3-е Иоанна";
                nazvaBel = "3-е Яна Багаслова";
                nomer = 61;
            }
            if (fit.contains("Иуд")) {
                nazva = "Иуды";
                nazvaBel = "Юды";
                nomer = 62;
            }
            if (fit.contains("Рим")) {
                nazva = "Римлянам";
                nazvaBel = "Да Рымлянаў";
                nomer = 63;
            }
            if (fit.contains("1 Кор")) {
                nazva = "1-е Коринфянам";
                nazvaBel = "1-е да Карынфянаў";
                nomer = 64;
            }
            if (fit.contains("2 Кор")) {
                nazva = "2-е Коринфянам";
                nazvaBel = "2-е да Карынфянаў";
                nomer = 65;
            }
            if (fit.contains("Гал")) {
                nazva = "Галатам";
                nazvaBel = "Да Галятаў";
                nomer = 66;
            }
            if (fit.contains("Эф")) {
                nazva = "Эфэсянам";
                nazvaBel = "Да Эфэсянаў";
                nomer = 67;
            }
            if (fit.contains("Флп")) {
                nazva = "Филиппийцам";
                nazvaBel = "Да Піліпянаў";
                nomer = 68;
            }
            if (fit.contains("Кол")) {
                nazva = "Колоссянам";
                nazvaBel = "Да Каласянаў";
                nomer = 69;
            }
            if (fit.contains("1 Фес")) {
                nazva = "1-е Фессалоникийцам (Солунянам)";
                nazvaBel = "1-е да Фесаланікійцаў";
                nomer = 70;
            }
            if (fit.contains("2 Фес")) {
                nazva = "2-е Фессалоникийцам (Солунянам)";
                nazvaBel = "2-е да Фесаланікійцаў";
                nomer = 71;
            }
            if (fit.contains("1 Тим")) {
                nazva = "1-е Тимофею";
                nazvaBel = "1-е да Цімафея";
                nomer = 72;
            }
            if (fit.contains("2 Тим")) {
                nazva = "2-е Тимофею";
                nazvaBel = "2-е да Цімафея";
                nomer = 73;
            }
            if (fit.contains("Тит")) {
                nazva = "Титу";
                nazvaBel = "Да Ціта";
                nomer = 74;
            }
            if (fit.contains("Флм")) {
                nazva = "Филимону";
                nazvaBel = "Да Філімона";
                nomer = 75;
            }
            if (fit.contains("Евр")) {
                nazva = "Евреям";
                nazvaBel = "Да Габрэяў";
                nomer = 76;
            }
            if (fit.contains("Откр")) {
                nazva = "Откровение (Апокалипсис)";
                nazvaBel = "Адкрыцьцё (Апакаліпсіс)";
                nomer = 77;
            }
            // Пс 88:12-13; 135:5; 145:6; Сир 18:1; Ин 1:3; Пс 22
            // Быт 13:15; 15:7, 18, 15-16; 26:3-4; Втор 34:4; 1 Тим 2:13
            String[] split = fit.split(",");
            for (String aSplit : split) {
                String splitres = aSplit.trim();
                int s2 = splitres.indexOf(" ", 2);
                if (s2 != -1) {
                    int a1 = splitres.indexOf(".");
                    if (a1 != -1) {
                        nomerglavy = Integer.parseInt(splitres.substring(s2 + 1, a1));
                        int a2 = splitres.indexOf("-");
                        if (a2 != -1) {
                            nachalo = splitres.substring(a1 + 1, a2);
                            konec = splitres.substring(a2 + 1);
                        } else {
                            nachalo = splitres.substring(a1 + 1);
                            konec = nachalo;
                        }
                    } else {
                        nomerglavy = Integer.parseInt(splitres.substring(s2 + 1));
                        nachalo = "1";
                        konec = "+-+";
                    }
                } else {
                    int a1 = splitres.indexOf(".");
                    int a2 = splitres.indexOf("-");
                    if (a1 != -1) {
                        if (a2 != -1) {
                            nomerglavy = Integer.parseInt(splitres.substring(0, a1));
                            nachalo = splitres.substring(a1 + 1, a2);
                            konec = splitres.substring(a2 + 1);
                        } else {
                            nomerglavy = Integer.parseInt(splitres.substring(0, a1));
                            nachalo = splitres.substring(a1 + 1);
                            konec = nachalo;
                        }
                    } else {
                        if (a2 != -1) {
                            nachalo = splitres.substring(0, a2);
                            konec = splitres.substring(a2 + 1);
                        } else {
                            nachalo = splitres;
                            konec = nachalo;
                        }
                    }
                }
                try {
                    Resources r = context.getResources();
                    if (semuxa) {
                        if (nomer == 1) inputStream = r.openRawResource(R.raw.biblias1);
                        if (nomer == 2) inputStream = r.openRawResource(R.raw.biblias2);
                        if (nomer == 3) inputStream = r.openRawResource(R.raw.biblias3);
                        if (nomer == 4) inputStream = r.openRawResource(R.raw.biblias4);
                        if (nomer == 5) inputStream = r.openRawResource(R.raw.biblias5);
                        if (nomer == 6) inputStream = r.openRawResource(R.raw.biblias6);
                        if (nomer == 7) inputStream = r.openRawResource(R.raw.biblias7);
                        if (nomer == 8) inputStream = r.openRawResource(R.raw.biblias8);
                        if (nomer == 9) inputStream = r.openRawResource(R.raw.biblias9);
                        if (nomer == 10) inputStream = r.openRawResource(R.raw.biblias10);
                        if (nomer == 11) inputStream = r.openRawResource(R.raw.biblias11);
                        if (nomer == 12) inputStream = r.openRawResource(R.raw.biblias12);
                        if (nomer == 13) inputStream = r.openRawResource(R.raw.biblias13);
                        if (nomer == 14) inputStream = r.openRawResource(R.raw.biblias14);
                        if (nomer == 15) inputStream = r.openRawResource(R.raw.biblias15);
                        if (nomer == 16) inputStream = r.openRawResource(R.raw.biblias16);
                        if (nomer == 20) inputStream = r.openRawResource(R.raw.biblias17);
                        if (nomer == 21) inputStream = r.openRawResource(R.raw.biblias18);
                        if (nomer == 22) inputStream = r.openRawResource(R.raw.biblias19);
                        if (nomer == 23) inputStream = r.openRawResource(R.raw.biblias20);
                        if (nomer == 24) inputStream = r.openRawResource(R.raw.biblias21);
                        if (nomer == 25) inputStream = r.openRawResource(R.raw.biblias22);
                        if (nomer == 28) inputStream = r.openRawResource(R.raw.biblias23);
                        if (nomer == 29) inputStream = r.openRawResource(R.raw.biblias24);
                        if (nomer == 30) inputStream = r.openRawResource(R.raw.biblias25);
                        if (nomer == 33) inputStream = r.openRawResource(R.raw.biblias26);
                        if (nomer == 34) inputStream = r.openRawResource(R.raw.biblias27);
                        if (nomer == 35) inputStream = r.openRawResource(R.raw.biblias28);
                        if (nomer == 36) inputStream = r.openRawResource(R.raw.biblias29);
                        if (nomer == 37) inputStream = r.openRawResource(R.raw.biblias30);
                        if (nomer == 38) inputStream = r.openRawResource(R.raw.biblias31);
                        if (nomer == 39) inputStream = r.openRawResource(R.raw.biblias32);
                        if (nomer == 40) inputStream = r.openRawResource(R.raw.biblias33);
                        if (nomer == 41) inputStream = r.openRawResource(R.raw.biblias34);
                        if (nomer == 42) inputStream = r.openRawResource(R.raw.biblias35);
                        if (nomer == 43) inputStream = r.openRawResource(R.raw.biblias36);
                        if (nomer == 44) inputStream = r.openRawResource(R.raw.biblias37);
                        if (nomer == 45) inputStream = r.openRawResource(R.raw.biblias38);
                        if (nomer == 46) inputStream = r.openRawResource(R.raw.biblias39);
                        if (nomer == 51) inputStream = r.openRawResource(R.raw.biblian1);
                        if (nomer == 52) inputStream = r.openRawResource(R.raw.biblian2);
                        if (nomer == 53) inputStream = r.openRawResource(R.raw.biblian3);
                        if (nomer == 54) inputStream = r.openRawResource(R.raw.biblian4);
                        if (nomer == 55) inputStream = r.openRawResource(R.raw.biblian5);
                        if (nomer == 56) inputStream = r.openRawResource(R.raw.biblian6);
                        if (nomer == 57) inputStream = r.openRawResource(R.raw.biblian7);
                        if (nomer == 58) inputStream = r.openRawResource(R.raw.biblian8);
                        if (nomer == 59) inputStream = r.openRawResource(R.raw.biblian9);
                        if (nomer == 60) inputStream = r.openRawResource(R.raw.biblian10);
                        if (nomer == 61) inputStream = r.openRawResource(R.raw.biblian11);
                        if (nomer == 62) inputStream = r.openRawResource(R.raw.biblian12);
                        if (nomer == 63) inputStream = r.openRawResource(R.raw.biblian13);
                        if (nomer == 64) inputStream = r.openRawResource(R.raw.biblian14);
                        if (nomer == 65) inputStream = r.openRawResource(R.raw.biblian15);
                        if (nomer == 66) inputStream = r.openRawResource(R.raw.biblian16);
                        if (nomer == 67) inputStream = r.openRawResource(R.raw.biblian17);
                        if (nomer == 68) inputStream = r.openRawResource(R.raw.biblian18);
                        if (nomer == 69) inputStream = r.openRawResource(R.raw.biblian19);
                        if (nomer == 70) inputStream = r.openRawResource(R.raw.biblian20);
                        if (nomer == 71) inputStream = r.openRawResource(R.raw.biblian21);
                        if (nomer == 72) inputStream = r.openRawResource(R.raw.biblian22);
                        if (nomer == 73) inputStream = r.openRawResource(R.raw.biblian23);
                        if (nomer == 74) inputStream = r.openRawResource(R.raw.biblian24);
                        if (nomer == 75) inputStream = r.openRawResource(R.raw.biblian25);
                        if (nomer == 76) inputStream = r.openRawResource(R.raw.biblian26);
                        if (nomer == 77) inputStream = r.openRawResource(R.raw.biblian27);
                    } else {
                        if (nomer == 1) inputStream = r.openRawResource(R.raw.sinaidals1);
                        if (nomer == 2) inputStream = r.openRawResource(R.raw.sinaidals2);
                        if (nomer == 3) inputStream = r.openRawResource(R.raw.sinaidals3);
                        if (nomer == 4) inputStream = r.openRawResource(R.raw.sinaidals4);
                        if (nomer == 5) inputStream = r.openRawResource(R.raw.sinaidals5);
                        if (nomer == 6) inputStream = r.openRawResource(R.raw.sinaidals6);
                        if (nomer == 7) inputStream = r.openRawResource(R.raw.sinaidals7);
                        if (nomer == 8) inputStream = r.openRawResource(R.raw.sinaidals8);
                        if (nomer == 9) inputStream = r.openRawResource(R.raw.sinaidals9);
                        if (nomer == 10) inputStream = r.openRawResource(R.raw.sinaidals10);
                        if (nomer == 11) inputStream = r.openRawResource(R.raw.sinaidals11);
                        if (nomer == 12) inputStream = r.openRawResource(R.raw.sinaidals12);
                        if (nomer == 13) inputStream = r.openRawResource(R.raw.sinaidals13);
                        if (nomer == 14) inputStream = r.openRawResource(R.raw.sinaidals14);
                        if (nomer == 15) inputStream = r.openRawResource(R.raw.sinaidals15);
                        if (nomer == 16) inputStream = r.openRawResource(R.raw.sinaidals16);
                        if (nomer == 17) inputStream = r.openRawResource(R.raw.sinaidals17);
                        if (nomer == 18) inputStream = r.openRawResource(R.raw.sinaidals18);
                        if (nomer == 19) inputStream = r.openRawResource(R.raw.sinaidals19);
                        if (nomer == 20) inputStream = r.openRawResource(R.raw.sinaidals20);
                        if (nomer == 21) inputStream = r.openRawResource(R.raw.sinaidals21);
                        if (nomer == 22) inputStream = r.openRawResource(R.raw.sinaidals22);
                        if (nomer == 23) inputStream = r.openRawResource(R.raw.sinaidals23);
                        if (nomer == 24) inputStream = r.openRawResource(R.raw.sinaidals24);
                        if (nomer == 25) inputStream = r.openRawResource(R.raw.sinaidals25);
                        if (nomer == 26) inputStream = r.openRawResource(R.raw.sinaidals26);
                        if (nomer == 27) inputStream = r.openRawResource(R.raw.sinaidals27);
                        if (nomer == 28) inputStream = r.openRawResource(R.raw.sinaidals28);
                        if (nomer == 29) inputStream = r.openRawResource(R.raw.sinaidals29);
                        if (nomer == 30) inputStream = r.openRawResource(R.raw.sinaidals30);
                        if (nomer == 31) inputStream = r.openRawResource(R.raw.sinaidals31);
                        if (nomer == 32) inputStream = r.openRawResource(R.raw.sinaidals32);
                        if (nomer == 33) inputStream = r.openRawResource(R.raw.sinaidals33);
                        if (nomer == 34) inputStream = r.openRawResource(R.raw.sinaidals34);
                        if (nomer == 35) inputStream = r.openRawResource(R.raw.sinaidals35);
                        if (nomer == 36) inputStream = r.openRawResource(R.raw.sinaidals36);
                        if (nomer == 37) inputStream = r.openRawResource(R.raw.sinaidals37);
                        if (nomer == 38) inputStream = r.openRawResource(R.raw.sinaidals38);
                        if (nomer == 39) inputStream = r.openRawResource(R.raw.sinaidals39);
                        if (nomer == 40) inputStream = r.openRawResource(R.raw.sinaidals40);
                        if (nomer == 41) inputStream = r.openRawResource(R.raw.sinaidals41);
                        if (nomer == 42) inputStream = r.openRawResource(R.raw.sinaidals42);
                        if (nomer == 43) inputStream = r.openRawResource(R.raw.sinaidals43);
                        if (nomer == 44) inputStream = r.openRawResource(R.raw.sinaidals44);
                        if (nomer == 45) inputStream = r.openRawResource(R.raw.sinaidals45);
                        if (nomer == 46) inputStream = r.openRawResource(R.raw.sinaidals46);
                        if (nomer == 47) inputStream = r.openRawResource(R.raw.sinaidals47);
                        if (nomer == 48) inputStream = r.openRawResource(R.raw.sinaidals48);
                        if (nomer == 49) inputStream = r.openRawResource(R.raw.sinaidals49);
                        if (nomer == 50) inputStream = r.openRawResource(R.raw.sinaidals50);
                        if (nomer == 51) inputStream = r.openRawResource(R.raw.sinaidaln1);
                        if (nomer == 52) inputStream = r.openRawResource(R.raw.sinaidaln2);
                        if (nomer == 53) inputStream = r.openRawResource(R.raw.sinaidaln3);
                        if (nomer == 54) inputStream = r.openRawResource(R.raw.sinaidaln4);
                        if (nomer == 55) inputStream = r.openRawResource(R.raw.sinaidaln5);
                        if (nomer == 56) inputStream = r.openRawResource(R.raw.sinaidaln6);
                        if (nomer == 57) inputStream = r.openRawResource(R.raw.sinaidaln7);
                        if (nomer == 58) inputStream = r.openRawResource(R.raw.sinaidaln8);
                        if (nomer == 59) inputStream = r.openRawResource(R.raw.sinaidaln9);
                        if (nomer == 60) inputStream = r.openRawResource(R.raw.sinaidaln10);
                        if (nomer == 61) inputStream = r.openRawResource(R.raw.sinaidaln11);
                        if (nomer == 62) inputStream = r.openRawResource(R.raw.sinaidaln12);
                        if (nomer == 63) inputStream = r.openRawResource(R.raw.sinaidaln13);
                        if (nomer == 64) inputStream = r.openRawResource(R.raw.sinaidaln14);
                        if (nomer == 65) inputStream = r.openRawResource(R.raw.sinaidaln15);
                        if (nomer == 66) inputStream = r.openRawResource(R.raw.sinaidaln16);
                        if (nomer == 67) inputStream = r.openRawResource(R.raw.sinaidaln17);
                        if (nomer == 68) inputStream = r.openRawResource(R.raw.sinaidaln18);
                        if (nomer == 69) inputStream = r.openRawResource(R.raw.sinaidaln19);
                        if (nomer == 70) inputStream = r.openRawResource(R.raw.sinaidaln20);
                        if (nomer == 71) inputStream = r.openRawResource(R.raw.sinaidaln21);
                        if (nomer == 72) inputStream = r.openRawResource(R.raw.sinaidaln22);
                        if (nomer == 73) inputStream = r.openRawResource(R.raw.sinaidaln23);
                        if (nomer == 74) inputStream = r.openRawResource(R.raw.sinaidaln24);
                        if (nomer == 75) inputStream = r.openRawResource(R.raw.sinaidaln25);
                        if (nomer == 76) inputStream = r.openRawResource(R.raw.sinaidaln26);
                        if (nomer == 77) inputStream = r.openRawResource(R.raw.sinaidaln27);
                    }
                    if (inputStream != null) {
                        InputStreamReader isr = new InputStreamReader(inputStream);
                        BufferedReader reader = new BufferedReader(isr);
                        String line;
                        StringBuilder builder = new StringBuilder();
                        while ((line = reader.readLine()) != null) {
                            if (line.contains("//")) {
                                int t1 = line.indexOf("//");
                                line = line.substring(0, t1).trim();
                                if (!line.equals(""))
                                    builder.append(line).append("\n");
                                continue;
                            }
                            builder.append(line).append("\n");
                        }
                        inputStream.close();
                        String[] split2 = builder.toString().split("===");
                        String r1 = split2[nomerglavy].trim(), r2;
                        int vN = r1.indexOf(nachalo);
                        int vK1 = r1.indexOf(konec);
                        int vK = r1.indexOf("\n", vK1);
                        if (semuxa && nomer == 22) {
                            r1 = r1.replace("\n", "<br>\n");
                            String[] r3 = r1.split("\n");
                            StringBuilder sb = new StringBuilder();
                            for (int w = Integer.valueOf(nachalo); w <= Integer.valueOf(konec); w++) {
                                sb.append(r3[w - 1]);
                            }
                            r2 = sb.toString();
                        } else {
                            if (vK1 != -1) {
                                if (vK != -1) {
                                    r2 = r1.substring(vN, vK);
                                } else {
                                    r2 = r1.substring(vN);
                                }
                            } else {
                                r2 = r1;
                            }
                        }
                        textViewZag = new TextView_Roboto_Condensed(context);
                        textViewOpis = new TextView_Roboto_Condensed(context);
                        textViewZag.setTextIsSelectable(true);
                        textViewOpis.setTextIsSelectable(true);
                        dzenNoch = k.getBoolean("dzen_noch", false);
                        if (dzenNoch) {
                            textViewZag.setTextColor(ContextCompat.getColor(context, by.carkva_gazeta.malitounik.R.color.colorIcons));
                            textViewOpis.setTextColor(ContextCompat.getColor(context, by.carkva_gazeta.malitounik.R.color.colorIcons));
                        } else {
                            textViewZag.setTextColor(ContextCompat.getColor(context, by.carkva_gazeta.malitounik.R.color.colorPrimary_text));
                            textViewOpis.setTextColor(ContextCompat.getColor(context, by.carkva_gazeta.malitounik.R.color.colorPrimary_text));
                        }
                        textViewZag.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontBiblia);
                        textViewZag.setTypeface(null, Typeface.BOLD);
                        String kon;
                        if (semuxa) nazva = nazvaBel;
                        if (nachalo.equals(konec)) {
                            kon = nazva + " " + nomerglavy + "." + nachalo;
                        } else if (konec.contains("+-+")) {
                            kon = nazva + " " + nomerglavy;
                        } else {
                            kon = nazva + " " + nomerglavy + "." + nachalo + "-" + konec;
                        }
                        textViewZag.setText(kon);
                        arrayList.add(textViewZag);
                        textViewOpis.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontBiblia);
                        if (semuxa && nomer == 22) {
                            //CaseInsensitiveResourcesFontLoader fontLoader = new CaseInsensitiveResourcesFontLoader();
                            textViewOpis.setText(MainActivity.fromHtml(context.getResources().getString(by.carkva_gazeta.malitounik.R.string.paralel_opis, r2)));
                        } else
                            textViewOpis.setText(context.getResources().getString(by.carkva_gazeta.malitounik.R.string.paralel_opis, r2));
                        arrayList.add(textViewOpis);
                    }
                } catch (Throwable ignored) {
                }
            }
        }
        return arrayList;
    }
}