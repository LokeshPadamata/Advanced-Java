<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

</head>

<body>
        <h1>Add Product</h1>
        <input type="text" id="pid" placeholder="enter pid"> <br><br>
        <input type="text" id="name" placeholder="enter name"> <br><br>
        <input type="number" id="price" placeholder="enter price"> <br><br>
        <input type="text" id="seller" placeholder="enter seller"> <br><br>
        <button id="addOrUpdateBtn" onclick="addProduct()">Add Product</button>
    
    
        <ul id="ul">
        </ul>
    
    <script>
        var products = [];
        function addProduct() {
            var pid = document.getElementById("pid").value;
            var name = document.getElementById("name").value;
            var price = document.getElementById("price").value;
            var seller = document.getElementById("seller").value;
            var product = {
                productId: pid,
                productName: name,
                price: price,
                seller: seller
            }
            console.log("product", product);
            products.push(product);
            console.log(products);
            clear();
            showProducts();
        }
        function editProduct(productId) {
            console.log("productId", productId);
            var index = 0;
            while (index < products.length) {
                var obj = products[index];
                if (obj.productId == productId) {
                    document.getElementById("pid").value = obj.productId;
                    document.getElementById("name").value = obj.productName;
                    document.getElementById("price").value = obj.price;
                    document.getElementById("seller").value = obj.seller;
                    document.getElementById("pid").disabled = true;
                }
                index++;
            }
            var btn = document.getElementById("addOrUpdateBtn");
            btn.innerHTML = "Save Product";
            btn.setAttribute('onclick', "saveProduct()");
        }
        function saveProduct() {
            var pid = document.getElementById("pid").value;
            var name = document.getElementById("name").value;
            var price = document.getElementById("price").value;
            var seller = document.getElementById("seller").value;
            var index = 0;
            while (index < products.length) {
                var obj = products[index];
                if (obj.productId == pid) {
                    obj.productName = name;
                    obj.price = price;
                    obj.seller = seller;
                    break;
                }
                index++;
            }
            var btn = document.getElementById("addOrUpdateBtn");
            btn.innerHTML = "Add Product";
            btn.setAttribute('onclick', "addProduct()");
            document.getElementById("pid").disabled = false;
            clear();
            showProducts();
        }
        function showProducts() {
            console.log("products", products);
            var ul = document.getElementById("ul");
            var index = 0;
            var listOfItems = "";
            while (index < products.length) {
                var obj = products[index];
                listOfItems = listOfItems + "<li>" + obj.productId + "&nbsp;&nbsp;&nbsp;" + obj.productName + "&nbsp;&nbsp;&nbsp;" + obj.price + "&nbsp;&nbsp;&nbsp;" + "<button onclick='deleteProduct(" + obj.productId + ")'>Delete</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<button onclick='editProduct(" + obj.productId + ")'>Edit</button>" + "</li>";
                index++;
            }
            ul.innerHTML = listOfItems;
        }
        function deleteProduct(prodId) {
            var index = 0;
            while (index < products.length) {
                var obj = products[index];
                if (obj.productId == prodId) {
                    products.splice(index, 1);
                    break;
                }
                index++;
            }
            showProducts();

        }

        function clear() {
            document.getElementById("pid").value = "";
            document.getElementById("name").value = "";
            document.getElementById("price").value = "";
            document.getElementById("seller").value = "";
        }
    </script>
</body>

</html>