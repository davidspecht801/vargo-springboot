$(document).ready(function () {
    $("form").submit(function (event) {
        var formData = {
            id: $("#customerId").val()
        };

        let htmlstr = "";
        $.ajax({
            type: "GET",
            url: "api/relations/" + formData.id,
            data: formData,
            dataType: "json",
            encode: true,
        }).done(function (data) {
            console.log(data.CUSTOMER.length);
            if (data != null && data.CUSTOMER != null && data.CUSTOMER.length > 0){

                htmlstr += "<table class='table table-dark'>" +
                    "<thead>" +
                    "<tr>" +
                    "<th scope='col'>Name</th>" +
                        "<th scope='col''>Education</th>" +
                    "</tr>" +
                    "</thead>"+
                    "<tbody>";

                data.CUSTOMER.forEach(o => {
                    console.info(o);

                    htmlstr += "<tr>";
                    htmlstr += "<td id='nameResult'>" + o.personName + "</td>";
                    htmlstr += "<td id='educationResult'>" + o.educationLevel + "</td>";

                    htmlstr += "</tr>";
                });
                htmlstr += "</tbody>" +
                "</table>";
                $("#resultContainer").html(htmlstr);
            } else {
                htmlstr = "<div class='bg-danger'>No results returned</div>";
                $("#resultContainer").html(htmlstr);
            }

        });

        event.preventDefault();
    });
});