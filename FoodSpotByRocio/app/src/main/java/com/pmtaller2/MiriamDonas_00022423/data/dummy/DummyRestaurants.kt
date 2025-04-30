package com.pmtaller2.MiriamDonas_00022423.data.dummy

import com.pmtaller2.MiriamDonas_00022423.data.model.Dish
import com.pmtaller2.MiriamDonas_00022423.data.model.Restaurant

val dummyRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Planet",
        description = "Las mejores pizzas del universo",
        imageUrl = "https://peruretail.sfo3.cdn.digitaloceanspaces.com/wp-content/uploads/pizza-3.jpg",
        categories = listOf("Pizzas", "Comida Italiana", "Vegetariano"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Pepperoni",
                description = "Clásica pizza con pepperoni y queso.",
                imageUrl = "https://cdn.unotv.com/images/2024/09/pizza-pepperoni-no-existe-italia-152140.jpeg"
            ),
            Dish(
                id = 2,
                name = "Pizza Vegetariana",
                description = "Pizza saludable con verduras frescas.",
                imageUrl = "https://cecotec.es/recetas/wp-content/uploads/2019/10/Mambo-pizza-vegetal-1140x500.jpg"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Burger King Kong",
        description = "Las hamburguesas más monstruosas",
        imageUrl = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https%3A%2F%2Farc-anglerfish-washpost-prod-washpost.s3.amazonaws.com%2Fpublic%2FM6HASPARCZHYNN4XTUYT7H6PTE.jpg?h=982&w=1200",
        categories = listOf("Pizzas", "Comida Italiana", "Vegetariano"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Hamburguesa Doble Queso",
                description = "Doble carne, doble queso, doble sabor.",
                imageUrl = "https://cocina-casera.com/wp-content/uploads/2016/11/hamburguesa-queso-receta.jpg"
            ),
            Dish(
                id = 4,
                name = "Hamburguesa Vegana",
                description = "Una opción deliciosa y saludable.",
                imageUrl = "https://www.cocinavital.mx/wp-content/uploads/2018/03/hamburguesa-vegana.jpg"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Taco Templo",
        description = "La auténtica comida mexicana",
        imageUrl = "https://www.thefoodinmybeard.com/wp-content/uploads/2009/11/wpt10.jpg",
        categories = listOf("Comida Mexicana", "Vegetariano"),
        menu = listOf(
            Dish(5, "Tacos al Pastor", "Con piña y adobo tradicional.", "https://lastaquerias.com/wp-content/uploads/2022/11/tacos-pastor-gaacc26fa8_1920.jpg"),
            Dish(6, "Tacos Veganos", "Tortilla con hongos y aguacate.", "https://recetasveganas.net/wp-content/uploads/2020/07/recetas-tacos-sin-carne-vegetariano-alubias-aguacate-tomate-olivas2.jpg")
        )
    ),
    Restaurant(
        id = 4,
        name = "Sushi Zen",
        description = "Frescura japonesa en cada bocado",
        imageUrl = "https://www.unileverfoodsolutions.com.mx/dam/global-ufs/mcos/NOLA/calcmenu/recipes/MX-recipes/general/sushi-empanizado/main-header.jpg",
        categories = listOf("Sushi", "Comida Japonesa", "Mariscos"),
        menu = listOf(
            Dish(7, "Sushi de Atún", "Atún rojo fresco sobre arroz.", "https://elronqueo.es/wp-content/uploads/2023/07/Nigiri-de-Atun-Rojo-con-Salsa-de-Miso.jpg"),
            Dish(8, "Sushi Vegano", "Aguacate, pepino y zanahoria.", "https://veganos.madrid/wp-content/uploads/2023/01/sushi-vegano.jpg")
        )
    ),
    Restaurant(
        id = 5,
        name = "La Pasta Loca",
        description = "Pasta artesanal con sabor casero",
        imageUrl = "https://mercadoventas.es/wp-content/uploads/2024/09/receta-de-pasta.jpg",
        categories = listOf("Comida Italiana", "Vegetariano", "Pastas"),
        menu = listOf(
            Dish(9, "Spaghetti Bolognesa", "Salsa de carne con pasta al dente.", "https://w6h5a5r4.delivery.rocketcdn.me/wp-content/uploads/2019/05/espaguetis-a-la-bolonesa-1080x671.jpg"),
            Dish(10, "Pasta Pesto", "Pasta con albahaca y piñones.", "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/0802C73C-3213-4AA6-BD3E-7390A13989FF/Derivates/ff280a78-bfae-46c9-9ea8-c63f5508cde8.jpg")
        )
    )
)
