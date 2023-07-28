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


        )
}