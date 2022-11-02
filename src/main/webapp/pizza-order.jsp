<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="partials/head.jsp"%>
</head>
<body>

    <div class="container">
        <form method="POST" action="/pizza-order">
            <p></p>
            <label for="crust">Crust: </label>
            <select id="crust" name="crust">
                <option value="original">Original</option>
                <option value="thin">Thin</option>
                <option value="stuffed-crust">Stuffed Crust</option>
            </select>
            <p></p>
            <label for="sauce">Source: </label>
            <select name="sauce" id="sauce">
                <option value="pesto">Pesto</option>
                <option value="white-garlic-sauce">White Garlic Sauce</option>
                <option value="garlic-ranch-sauce">Garlic Ranch Sauce</option>
                <option value="buffalo">Buffalo</option>
                <option value="marinara-sauce">Marinara Sauce</option>
            </select>
            <p></p>
            <label for="size">Source: </label>
            <select name="size" id="size">
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
            </select>
            <p></p>
            Toppings:
            Pepperoni <input type="checkbox" name="toppings" value="Pepperoni">
            Mushrooms <input type="checkbox" name="toppings" value="Mushroom">
            Extra Cheese <input type="checkbox" name="toppings" value="Extra Cheese">
            Sausage <input type="checkbox" name="toppings" value="Sausage">
            Onion <input type="checkbox" name="toppings" value="Onion">
            Black Olives <input type="checkbox" name="toppings" value="Black Olives">
            Green Pepper <input type="checkbox" name="toppings" value="Green Pepper">
            Fresh Garlic <input type="checkbox" name="toppings" value="Fresh Garlic">
            <p></p>
            <label for="address">Delivery Address: </label>
            <input type="text" id="address" name="address" placeholder="Please enter your address">
            <p></p>
            <button type="submit">Place Order</button>
        </form>
    </div>


<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
