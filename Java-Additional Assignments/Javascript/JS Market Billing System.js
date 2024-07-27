<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Market Billing System</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            font-family: Arial, sans-serif;
        }
        h1 {
            color: blue;
        }
        .container {
            display: flex;
            justify-content: space-between;
            width: 80%;
        }
        #ProductForm, .billingDetails {
            flex: 1;
            margin: 40px;
        }
        #ProductForm {
            color: blue;
        }
        #addItem {
            background-color: lightblue;
        }
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 8px;
            text-align: left;
        }
        table {
            width: 80%;
            margin: 20px auto; /* Center the table */
        }
        .billingDetails {
            text-align: center;
            color: blue;
        }
        .totalPrice {
            font-size: 1.5em;
            margin-top: 20px;
        }
    </style>
    <script>
        let products = [];

        function addProduct() {
            const productname = document.getElementById("name").value;
            const Price = parseFloat(document.getElementById("price").value);
            const Quantity = parseInt(document.getElementById("quantity").value);
            if (productname && Price > 0 && Quantity > 0) {
                const totalPrice = Price * Quantity;
                const product = { productname, Price, Quantity, totalPrice };
                products.push(product);
                displayProducts();
                calculateTotalPrice();
            } else {
                alert("Please enter valid details.");
            }
            document.getElementById("ProductForm").reset();
        }

        function displayProducts() {
            const productsTable = document.getElementById("productTableBody");
            productsTable.innerHTML = '';
            products.forEach((product, index) => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${product.productname}</td>
                    <td>${product.Price}</td>
                    <td>${product.Quantity}</td>
                    <td>${product.totalPrice}</td>
                `;
                productsTable.appendChild(row);
            });
        }

        function calculateTotalPrice() {
            const total = products.reduce((acc, product) => acc + product.totalPrice, 0);
            document.getElementById("totalPrice").textContent = total.toFixed(2);
            document.getElementById("net_total").textContent = `Your net amount is Rs. ${total.toFixed(2)}`;
        }
    </script>
</head>
<body>
    <center>
        <h1>Market Billing System</h1>
    </center>
    <div class="container">
        <form id="ProductForm">
            <h3>Add Product Item</h3>
            Product name:<br/><br>
            <input type="text" id="name" name="Productname"/><br><br/>
            Price:<br/><br>
            <input type="text" id="price" name="Price"/><br><br/>
            Quantity:<br/><br>
            <input type="text" id="quantity" name="Quantity"/><br><br/>
            <button type="button" id="addItem" onclick="addProduct()">+Add Item</button>
        </form>
        <div class="billingDetails">
            <h3 id="net_total">Bill details of total items</h3>
            <h2>Your net amount is Rs: <span id="totalPrice">0</span></h2>
        </div>
    </div>
    <table id="table">
        <thead>
            <tr>
                <th>Product Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Total Price</th>
            </tr>
        </thead>
        <tbody id="productTableBody"></tbody>
    </table>
</body>
</html>
