<!DOCTYPE html>
<html>
<head>
  <title>Lifetime Snack Supply</title>
</head>
<body>
  <h1 id="result"></h1>
  <script>
    let age = 25;
    let maxAge = 85;
    let numPerDay = 2;

    let totalRequired = (numPerDay * 365) * (maxAge - age);

    document.getElementById("result").innerHTML = You will need ${totalRequired} to last you until the ripe old age of ${maxAge};
  </script>
</body>
</html>
