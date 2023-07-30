package com.example.appmke.backend

import com.example.appmke.backend.data.Cards
import com.example.appmke.backend.data.Owner
import com.example.appmke.backend.data.Promotion

object ProductsLists {
    val list = mutableListOf(
        Products(
            1,
            "Campera urbana",
            "Urban",
            25.99,
            20.00,
            "%20",
            "$",
            false,
            Promotion(15.00, 6, Cards("columbia", "visa")),
            "21/02/23",
            false,
            false,
            Owner("luis", "flexiplus"),
            43,
            4.00,
            43.00,
            "La Campera Urbana Lotto Hs May Hombre es una prenda moderna y versátil para los hombres que buscan estilo y comodidad en su vestimenta diaria.",
            "20%",
            4.99,
            "new york",
            "https://www.stockcenter.com.ar/on/demandware.static/-/Sites-365-dabra-catalog/default/dw630c4b07/products/LONIFW230473/LONIFW230473-1.JPG"
        ),
        Products(
            2,
            "Remera cuello en v",
            "Fashion",
            39.99,
            20.00,
            "%20",
            "$",
            false,
            Promotion(15.00, 6, Cards("Columbia", "visa")),
            "21/02/23",
            false,
            false,
            Owner("luis", "flexiplus"),
            43,
            4.00,
            43.00,
            "Remera básica lisa de jersey de algodón 24/1. Con escote en V.",
            "20%",
            4.99,
            "new york",
            "https://forever21.com.ar/media/catalog/product/cache/06cfaa02c67cf3a5c3c05d775284c631/r/e/remera-hombre-basica-escote-v-forever21-r2m091002-100_1__1_3.jpg"
        ),
        Products(
            3,
            "Remera cuello redondo",
            "SunDresses",
            29.99,
            20.00,
            "%20",
            "$",
            false,
            Promotion(15.00, 6, Cards("Columbia", "Visa")),
            "21/02/23",
            false,
            false,
            Owner("Luis", "flexiplus"),
            43,
            4.00,
            43.00,
            "Remera básica lisa de jersey de algodón 24/1. Con cuello redondo",
            "20%",
            4.99,
            "new york",
            "https://forever21.com.ar/media/catalog/product/cache/06cfaa02c67cf3a5c3c05d775284c631/r/e/remera-hombre-basica-escote-v-forever21-r2m091002-100_1__1_3.jpg"
        ),
        Products(
            4,
            "Buzo cuello redondo",
            "UrbanRider",
            79.99,
            20.00,
            "%20",
            "$",
            false,
            Promotion(15.00, 6, Cards("Columbia", "Visa")),
            "21/02/23",
            false,
            false,
            Owner("Luis", "flexiplus"),
            43,
            4.00,
            43.00,
            "Buzo liso de jersey de algodón 24/1. Con escote en V.",
            "20%",
            4.99,
            "new york",
            "https://deliverind.com.ar/wp-content/uploads/2022/10/BUZO-OVERSIZE-RUSTICO-22-PORTADA-10-scaled.jpg.webp"
        ),
        Products(
            5,
            "Buzo capucha",
            "CozyKnits",
            45.99,
            20.00,
            "%20",
            "$",
            false,
            Promotion(
                15.00,
                6,
                Cards(
                    "columbia",
                    "visa"
                )
            ),
            "21/02/23",
            false,
            false,
            Owner("Luis", "flexiplus"),
            43,
            4.00,
            43.00,
            "Buzo con capucha liso de jersey de algodón",
            "15%",
            0.00,
            "Monte Grande",
            "https://remerasya.com/media/catalog/product/cache/839e5c25c645eac744603bf9726fb4fd/b/u/buzo_con_capucha_friza_pesada_negro_1.jpg"

        ),
        Products(
            6,
            "Zapatillas deportivas",
            "Nike",
            89.99,
            70.00,
            "%15",
            "$",
            true,
            Promotion(
                70.00,
                3,
                Cards(
                    "visa",
                    "mastercard"
                )
            ),
            "15/03/23",
            true,
            true,
            Owner(
                "María",
                "mariadeportes"
            ),
            120,
            4.5,
            82.00,
            "Las zapatillas deportivas Nike Air Max ofrecen comodidad y estilo para tus actividades deportivas y uso diario.",
            "15%",
            0.00,
            "los angeles",

            "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/68e68a11-7d25-4680-bde3-7e93a8c9fed9/air-jordan-3-retro-big-kids-shoes-Trq8Fk.png"
        ),
        Products(
            7,
            "Reloj de pulsera",
            "Casio",
            39.99,
            30.00,
            "%25",
            "$",
            true,
            Promotion(
                30.00,
                4,
                Cards(
                    "visa",
                    "amex"
                )
            ),
            "05/04/23",
            false,
            true,
            Owner(
                "Carlos",
                "timezone"
            ),
            65,
            4.2,
            42.00,
            "Un reloj de pulsera clásico de la marca Casio, perfecto para cualquier ocasión.",
            "25%",
            0.00,
            "miami",

            "https://www.casio.com/content/dam/casio/product-info/locales/latin/es-ar/timepiece/product/watch/G/GM/GMA/gma-s114rx-7a/assets/GMA-S114RX-7A_N.png.transform/main-visual-pc/image.png"
        ),
        Products(
            8,
            "Mesa de escritorio",
            "IKEA",
            129.99,
            110.00,
            "%15",
            "$",
            true,
            Promotion(
                110.00,
                1,
                Cards(
                    "visa",
                    "paypal"
                )
            ),

            "28/06/23",
            true,
            true,
            Owner(
                "Elena",
                "homestyler"
            ),
            35,
            4.5,
            120.00,
            "Una mesa de escritorio elegante y funcional de IKEA, ideal para tu espacio de trabajo en casa.",
            "15%",
            0.00,
            "stockholm",
            "https://www.ikea.com/nl/en/images/products/micke-desk-white__0851508_pe565256_s5.jpg?f=xl"


        ),
        Products(
            9,
            "Auriculares inalámbricos",
            "Sony",
            89.99,
            75.00,
            "%16",
            "$",
            false,
            Promotion(
                75.00,
                2,
                Cards(
                    "mastercard",
                    "discover"
                )
            ),
            "12/05/23",
            true,
            true,
            Owner(
                "Ana",
                "sonylover"
            ),
            90,
            4.8,
            85.00,
            "Auriculares inalámbricos con excelente calidad de sonido y diseño ergonómico de Sony.",
            "16%",
            5.99,
            "tokyo",

            "https://www.sony.com.ar/image/7eaefbd8262b148fbeff063d409cb5da?fmt=pjpeg&wid=1014&hei=396&bgcolor=F1F5F9&bgc=F1F5F9"
        ),
        Products(
            10,
            "Botella de vino reserva",
            "VinedosEjemplo",
            29.99,
            25.00,
            "%17",
            "$",
            false,
            Promotion(
                25.00,
                1,
                Cards(
                    "amex",
                    "dinersclub"
                )
            ),
            "15/07/23",
            false,
            true,
            Owner(
                "Roberto",
                "wineconnoisseur"
            ),
            20,
            4.9,
            30.00,
            "Un exquisito vino reserva con sabor y aroma intenso de VinedosEjemplo.",
            "17%",
            7.99,
            "madrid",
            "https://www.brancastore.com.ar/902-large_default/combo-fabre-montmayou-terruno-reserva-malbeccabernet-franc.jpg"
        ),
        Products(
            11,
            "Zapatillas deportivas",
            "Adidas",
            59.99,
            50.00,
            "%15",
            "$",
            false,
            Promotion(
                45.00,
                4,
                Cards(
                    "visa",
                    "diners"
                )
            ),
            "10/04/23",
            false,
            true,
            Owner(
                "Juan",
                "fitguy"
            ),
            300,
            4.7, 500.00,
            "pintura latex mate máximo poder cubritivo.super lavable.",
            "15%",
            200.00,
            "caballito",
            "https://pintecord.com.ar/web/image/product.product/31749/image_1024/%5B249467%5D%20Albalatex%20Latex%20Lavable%20Interior%20Blanco%20Mate%20%281%20L%29?unique=de43ff0"
        ),
        Products(
            12,
            "parlantes ",
            "Samsung",
            199.99,
            179.00,
            "%10",
            "$",
            true,
            Promotion(
                165.00,
                12,
                Cards(
                    "amex",
                    "discover"
                )
            ),
            "05/05/23",
            true,
            true,
            Owner(
                "Carolina",
                "techgeek"
            ),
            30,
            4.7,
            199.99,
            "La tablet de 10 pulgadas de Samsung es ideal para disfrutar de tus contenidos multimedia en cualquier lugar.",
            "10%",
            0.00,
            "tokyo",
            "https://images.samsung.com/is/image/samsung/p6pim/ar/sm-x200nzamaro/gallery/ar-galaxy-a8-sm-x200-sm-x200nzamaro-531066536?\$650_519_PNG"
        ),
        Products(
            13,
            "Reloj de pulsera",
            "Casio",
            79.99,
            69.99,
            "%13",
            "$",
            true,
            Promotion(
                59.99,
                6,
                Cards(
                    "mastercard",
                    "visa"
                )
            ),
            "20/06/23",
            true,
            true,
            Owner(
                "Roberto",
                "time lover"
            ),
            60,
            4.9,
            80.00,
            "Este elegante reloj de pulsera casio complementará tu look con estilo y precisión.",
            "13%",
            0.0,
            "london",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Favantjoyas.com%2Fwp-content%2Fuploads%2FAvant-Joyas-Reloj-Casio-A700WMG-9A.jpg&tbnid=pdwBK50WhCC8wM&vet=12ahUKEwjHxIDF7KiAAxXtp5UCHUCxDGIQMygOegUIARCjAw..i&imgrefurl=https%3A%2F%2Favantjoyas.com%2Fproducto%2Freloj-casio-a700wmg-9a%2F&docid=1IXjpbds1sJXjM&w=1000&h=1000&q=reloj%20casio&ved=2ahUKEwjHxIDF7KiAAxXtp5UCHUCxDGIQMygOegUIARCjAw"
        ),
        Products(
            14,
            "Escritorio PC",
            "Paquito",
            1000.0,
            899.0,
            "%10",
            "$",
            true,
            Promotion(
                799.0,
                9,
                Cards(
                    "mastercard",
                    "visa"
                )
            ),
            "20/09/21",
            false,
            false,
            Owner(
                "Carlos",
                "cartucho"
            ),
            19,
            3.5,
            1200.0,
            "Lindo escritorio para poder trabajar desde casa o jugar en la compu",
            "23%",
            0.00,
            "mar del plata",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDXccLcHWKij6kauka3c_Wmjmy3sTsbz0Yl4zIRIZ58WscthS0JikgHKJ_5Mgd3TdoXzU&usqp=CAU"
        ),
        Products(
            15,
            "pintura",
            "alba",
            20.999,
            18.99,
            "%15",
            "$",
            true,
            Promotion(
                18.99,
                5,
                Cards(
                    "mastercard",
                    "visa"
                )
            ),
            "20/06/23",
            true,
            true,
            Owner(
                "joaquin",
                "full Painting"
            ),
            60,
            4.9,
            80.00,
            "Este elegante reloj de pulsera casio complementará tu look con estilo y precisión.",
            "13%",
            0.00,
            "london",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Favantjoyas.com%2Fwp-content%2Fuploads%2FAvant-Joyas-Reloj-Casio-A700WMG-9A.jpg&tbnid=pdwBK50WhCC8wM&vet=12ahUKEwjHxIDF7KiAAxXtp5UCHUCxDGIQMygOegUIARCjAw..i&imgrefurl=https%3A%2F%2Favantjoyas.com%2Fproducto%2Freloj-casio-a700wmg-9a%2F&docid=1IXjpbds1sJXjM&w=1000&h=1000&q=reloj%20casio&ved=2ahUKEwjHxIDF7KiAAxXtp5UCHUCxDGIQMygOegUIARCjAw"
        ),
        Products(
            16,
            "parlantes",
            "samsung",
            45.99,
            35.99,
            "%19",
            "$",
            true,
            Promotion(
                42.99,
                5,
                Cards(
                    "mastercard",
                    "visa"
                )
            ),
            "20/06/23",
            true,
            true,
            Owner(
                "benjamin",
                "benjaMusic"
            ),
            120,
            4.9,
            30.00,
            " parlantes de alta calidad de sonido efecto surround.",
            "13%",
            0.00,
            "palermo",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fnews.samsung.com%2Far%2Fsamsung-presenta-sus-nuevas-sound-tower-portatiles&psig=AOvVaw1GKoWRqSg8IzRENkQBWVe-&ust=1690375414252000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOClk6PxqYADFQAAAAAdAAAAABAF"
        ),
        Products(
            17,
            "colchón",
            "belmo",
            130.00,
            125.99,
            "%19",
            "$",
            true,
            Promotion(
                45.99,
                5,
                Cards(
                    "mastercard",
                    "visa"
                )
            ),
            "21/02/23",
            true,
            true,
            Owner(
                "carlos",
                "carlos Sueñolar"
            ),
            125,
            4.9,
            50.00,
            "excelente colchón ,suavidad y confort.",
            "13%",
            0.00,
            "villa crespo",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lanerodelsud.com.ar%2Fproductos%2Fcolchon-belmo-espuma-alta-densidad-density-2%2F&psig=AOvVaw23QOcJ7ufuDSzxqU7uzsE1&ust=1690375780336000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPCwvdHyqYADFQAAAAAdAAAAABAI"
        ),
        Products(
            18,
            "acondicionador de aire",
            "pilco",
            130.00,
            125.99,
            "%19",
            "$",
            false,
            Promotion(
                44.99,
                9,
                Cards(
                    "mastercard",
                    "visa"
                )
            ),
            "20/06/23",
            true,
            true,
            Owner(
                "ricardo",
                "ricky ICE"
            ),
            129,
            4.9,
            50.00,
            "frio calor de 3000 frigorias .",
            "13%",
            0.0,
            "villa crespo",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmonterosrl.com.ar%2Fproducto%2Fart-15161-aire-acondicionado-philco-3200w%2F&psig=AOvVaw0P6vsIKljUAp3PuJbn1m_L&ust=1690376185712000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKih-JL0qYADFQAAAAAdAAAAABAK"
        ),
        Products(19,
            "stereo",
            "pionner",
            100.00,
            95.99,
            "%19",
            "$",
            true,
            Promotion(
                94.99,
                8,
                Cards(          "mastercard",
                    "visa"
                )      ),
            "20/06/23",
            true,
            true,
            Owner(
                "alberto",
            "music sound"
        ),
        129,
        4.9,
        50.00,
        "stereo pionner con entrada usb,bluetooth .",
        "13%",
        70.00,
        "villa crespo",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.fravega.com%2Fp%2Fstereo-para-auto-pioneer-bluetooth-usb-mp3-radio-am-fm-mvh-s215bt-20021412%2F&psig=AOvVaw1LgWU49nOeSpqwRT4IseZ3&ust=1690376457321000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCMjjipT1qYADFQAAAAAdAAAAABA"
    )
    )
}