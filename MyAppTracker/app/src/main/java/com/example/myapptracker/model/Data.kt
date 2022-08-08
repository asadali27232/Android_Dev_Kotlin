package com.example.myapptracker.model

import com.example.myapptracker.R

class Data {
    fun prepare(): List<AppCard> {
        return listOf<AppCard>(
            AppCard(
                "Happy Birthday",
                R.drawable.happy_birthday_icon,
                "Happy Birthday App is my first ever Android app it display a birthday " +
                        "wish card on screen. While developing this app I have learned about; what " +
                        "are user interface elements, such as Views and ViewGroups, How to display " +
                        "text in a TextView in an app and how to set attributes, such as text, font, " +
                        "and margin on a TextView.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/HappyBirthday",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115357&authkey=ABeMTa2rPaQ8o6A",
                "happy_birthday"
            ),
            AppCard(
                "My Dice",
                R.drawable.my_dice_icon,
                "Dice Roller Android app that has a Button to roll a dice and update the " +
                        "image on the screen. While developing this app I have learned about; " +
                        "how to add a Button to an Android app, how to add behavior for when a " +
                        "Button is tapped in the app. how to open and modify the Activity code " +
                        "of an app. how to display a Toast message and how to update the contents" +
                        " of a TextView and Image while the app is running.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/MyDice",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115352&authkey=ANUREBr-Rtvh8kI",
                "my_dice"
            ),
            AppCard(
                "Base Converter",
                R.drawable.base_converter_icon,
                "Base Converter Android app that converts numbers system to a different " +
                        "number system. This app has a drop down menu to choose source and target " +
                        "base and two Material Text Input Layouts. Also have start and end icons of " +
                        "fields and a convert button to execute the main task in this case conversion.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/BaseConverter",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115354&authkey=APWlWuGchM_Kd1A",
                "base_converter"
            ),
            AppCard(
                "Tip Time",
                R.drawable.tip_time_icon,
                "Tip Time Android app calculates tip amount according to the service " +
                        "cost and service quality. It also round up the amount for you. In this app" +
                        " I learn about more Android Material Components like Radio Button, Radio " +
                        "Group and Switch Button and applied onClickListeners on Radio Buttons and Switch Button.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/TipTime",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115355&authkey=AHeUHDrFXE0chsY",
                "tip_time"
            ),
            AppCard(
                "Affirmations",
                R.drawable.affirmations_icon,
                "Affirmations Android app shows affirmations embedded with a beautiful " +
                        "image using Card View an amazing way to express data on screen. In this app I used a Recycler View most common and widely used " +
                        "Android Component. Recycler View is used to display a unlimited data on " +
                        "the screen by recycling the screen and saving a huge memory using Adapters " +
                        "and View Holders.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/Affirmations",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115353&authkey=ABLAi824ehKxc88",
                "affirmations"
            ),
            AppCard(
                "Contacts",
                R.drawable.contacts_icon,
                "Contacts Android app simply display contact cards with dummy data." +
                        " In this app practised Recycler View and Card View to gather to have " +
                        "more grip on these to main concepts of Android app. I also dynamic coloring" +
                        " on Card backgrounds using modulus.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/ContactsRecyclerView",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115358&authkey=AHQHXjD5FaMnx1Q",
                "contacts"
            ),
            AppCard(
                "Songs List",
                R.drawable.songs_list_icon,
                "Songs List Android ap displays a list of Top Hit Songs of Pakistan " +
                        " In this app practised Recycler View and Card View to gather to have" +
                        "more grip on these to main concepts of Android app.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/SongsListRecyclerView",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115356&authkey=ADUMWqthAoR5z4Y",
                "songs_list"
            ),
            AppCard(
                "Unit Converter",
                R.drawable.unit_converter_icon,
                "Unit Converter Android app is similar to Base Converter app but it " +
                        "converts Units. I have used onTextChangeListener to effect the output " +
                        "instantly while the Input text is changed and also changed the drop down " +
                        "list for source and target units dynamically based on conversion type.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/UnitConverter",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115360&authkey=AAc2qcW7FXMxPa4",
                "unit_converter"
            ),
            AppCard(
                "Words",
                R.drawable.words_icon,
                "Words Android app is basically a words learning app it improves your " +
                        "word vocabulary. It is my first Multi Activity app using Intents. Used an " +
                        "explicit intent to navigate to a specific activity. Used an implicit " +
                        "intent to navigate to content in another app. Added menu options to add " +
                        "buttons to the app bar. Also developed this app using Jetpack " +
                        "Navigation Component.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/Words",
                "https://onedrive.live.com/download?cid=D370FCB232CA085E&resid=D370FCB232CA085E%2115359&authkey=AOsSJ0axao1p6_Y",
                "words"
            ),
            AppCard(
                "Dessert Clicker",
                R.drawable.dessert_clicker_icon,
                "Dessert Clicker Android app just counts the number of desserts sold " +
                        "and more you sold the dessert you starts selling more expensive desserts." +
                        "The basic purpose of this app is to study about Activity Life Cycle and " +
                        "how to save small amount of data in thr form of Bundle when your app configuration changes i.e " +
                        "user rotates the screen.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/DessertClicker",
                "",
                "dessert_clicker"
            ),
            AppCard(
                "Memories",
                R.drawable.memories_icon,
                "Memories Android app displays the memories pictures. In this app " +
                        "I have used most power to set of libraries in android named Jetpack. " +
                        "As clear from the name Jetpack libraries are design to make app " +
                        "development more robust, maintain able and sustainable. This app " +
                        "also present an excellent way wo View Binding.",

                "https://github.com/asadali27232/Android_Dev_Kotlin/tree/main/Memories",
                "",
                "memories"
            )
        )
    }
}