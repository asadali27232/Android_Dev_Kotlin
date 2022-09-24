package com.example.cuitimes.data

class TimetableList {
    fun mondayTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Data Structures and Algorithms",
                "LAB Class - C19",
                "Humera Niaz",
                "11:30 AM - 02:30 PM"
            ),
            Timetable(
                "Database Systems I",
                "LAB Class - C1",
                "Faisal Mumtaz",
                "02:30 PM - 05:30 PM"
            )
        )
    }

    fun tuesdayTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Communication Skills",
                "Theory Lecture - C5",
                "Huma Ijaz",
                "11:30 AM - 01:00 PM"
            ),
            Timetable(
                "Database Systems I",
                "Theory Lecture - C5",
                "Hamid Turab Mirza",
                "01:00 PM - 02:30 PM"
            ),
            Timetable(
                "Microprocessor and Assembly Language",
                "LAB Class - C13",
                "Khaqan Zaheer",
                "02:30 PM - 05:30 PM"
            )
        )
    }

    fun wednesdayTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Data Structures and Algorithms",
                "Theory Lecture - C5",
                "Humera Niaz",
                "01:00 PM - 02:30 PM",
            ),
            Timetable(
                "Software Engineering Concepts",
                "Theory Lecture - C5",
                "Dr. Farukh Zeshan",
                "02:30 PM - 04:00 PM"
            ),
            Timetable(
                "Differential Equations",
                "Theory Lecture - C5",
                "Dr. Muhammad Younas",
                "04:00 PM - 05:30 PM"
            )
        )
    }

    fun thursdayTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Data Structures and Algorithms",
                "Theory Lecture - C5",
                "Humera Niaz",
                "11:30 AM - 01:00 PM"
            ),
            Timetable(
                "Database Systems I",
                "Theory Lecture - C5",
                "Hamid Turab Mirza",
                "01:00 PM - 02:30 PM"
            ),
            Timetable(
                "Communication Skills",
                "Theory Lecture - C5",
                "Huma Ijaz",
                "02:30 PM - 04:00 PM"
            ),
            Timetable(
                "Microprocessor and Assembly Language",
                "Theory Lecture - C5",
                "Khaqan Zaheer",
                "04:00 PM - 05:30 PM"
            )
        )
    }

    fun fridayTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Microprocessor and Assembly Language",
                "Theory Lecture - C5",
                "Khaqan Zaheer",
                "11:30 AM - 01:00 PM"
            ),
            Timetable(
                "Software Engineering Concepts",
                "Theory Lecture - C5",
                "Dr. Farukh Zeshan",
                "02:30 PM - 04:00 PM"
            ),
            Timetable(
                "Differential Equations",
                "Theory Lecture - C5",
                "Dr. Muhammad Younas",
                "04:00 PM - 05:30 PM"
            )
        )
    }

    fun emptyTimetable(): List<Timetable> {
        return listOf<Timetable>()
    }

    fun malTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Tuesday",
                "LAB Class - C13",
                "Khaqan Zaheer",
                "02:30 PM - 05:30 PM"
            ),
            Timetable(
                "Thursday",
                "Theory Lecture - C5",
                "Khaqan Zaheer",
                "04:00 PM - 05:30 PM"
            ),
            Timetable(
                "Friday",
                "Theory Lecture - C5",
                "Khaqan Zaheer",
                "11:30 AM - 01:00 PM"
            )
        )
    }

    fun csTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Tuesday",
                "Theory Lecture - C5",
                "Huma Ijaz",
                "11:30 AM - 01:00 PM"
            ),
            Timetable(
                "Thursday",
                "Theory Lecture - C5",
                "Huma Ijaz",
                "02:30 PM - 04:00 PM"
            )
        )
    }

    fun deTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Wednesday",
                "Theory Lecture - C5",
                "Dr. Sadia Khalid",
                "04:00 PM - 05:30 PM"
            ),
            Timetable(
                "Friday",
                "Theory Lecture - C5",
                "Dr. Sadia Khalid",
                "04:00 PM - 05:30 PM"
            )
        )
    }

    fun secTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Wednesday",
                "Theory Lecture - C5",
                "Dr. Farukh Zeshan",
                "02:30 PM - 04:00 PM"
            ),
            Timetable(
                "Friday",
                "Theory Lecture - C5",
                "Dr. Farukh Zeshan",
                "02:30 PM - 04:00 PM"
            )
        )

    }

    fun dbTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Monday",
                "LAB Class - C1",
                "Faisal Mumtaz",
                "02:30 PM - 05:30 PM"
            ),
            Timetable(
                "Tuesday",
                "Theory Lecture - C5",
                "Hamid Turab Mirza",
                "01:00 PM - 02:30 PM"
            ),
            Timetable(
                "Thursday",
                "Theory Lecture - C5",
                "Hamid Turab Mirza",
                "01:00 PM - 02:30 PM"
            )
        )
    }

    fun dsaTimetable(): List<Timetable> {
        return listOf<Timetable>(
            Timetable(
                "Monday",
                "LAB Class - C19",
                "Humera Niaz",
                "11:30 AM - 02:30 PM"
            ),
            Timetable(
                "Wednesday",
                "Theory Lecture - C5",
                "Humera Niaz",
                "01:00 PM - 02:30 PM",
            ),
            Timetable(
                "Thursday",
                "Theory Lecture - C5",
                "Humera Niaz",
                "11:30 AM - 01:00 PM"
            )
        )

    }

}