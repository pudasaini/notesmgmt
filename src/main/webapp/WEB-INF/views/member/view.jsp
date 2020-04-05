<%@ taglib prefix="ui" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<ui:header />
<section class="panel">
    <header class="panel-heading">
        <div class="panel-actions">
            <a href="#" class="fa fa-caret-down"></a>
        </div>

        <h2 class="panel-title">Member Details</h2>
    </header>
    <div class="panel-body">
        <table class="table table-bordered table-striped mb-none"
               id="memberTable">
            <thead>
            <tr>
                <th>First Name </th>
                <th>Last Name </th>
                <th>Address </th>
                <th>Contact NO </th>
                <th>Member Role</th>
                <th>Action</th>
            </tr>
            </thead>
        </table>
    </div>
</section>

<ui:footer />


<script>
    $(document).ready(function () {
        $('#memberTable').DataTable({
            dom: 'Bfrtip',
            "scrollX": true,
            "bProcessing": true,
            "sAjaxDataProp": "",
            "bServerSide": false,
            "ajax": {
                "url": "${pageContext.request.contextPath}/member/getall",
                "type": "GET"
            },
            "columns": [

                {"data": "firstName", "defaultContent": ""},
                {"data": "lastName", "defaultContent": ""},
                {"data": "address", "defaultContent": ""},
                {"data": "contactNumber", "defaultContent": ""},
                {"data": "memberRole", "defaultContent": ""},


                {
                    "data": "Action",
                    "orderable": false,
                    "searchable": true,
                    "render": function (data, type, row, meta) {
                        let a = '<a class="btn btn-info btn-sm btn-rounded" onclick="edit(' + row.id + ')">Edit</a><a class="btn btn-danger btn-sm btn-rounded"  onclick="deletedata('
                            + row.id
                            + ')">Delete</a>';
                        return a;
                    }
                }
            ],
            "destroy":true
        });
    });



    //to delete data
    function deleteDataFromApi(url) {
        $.ajax({
            url: url,
            type: 'DELETE',
            beforeSend: function () {
                return confirm("Are you sure?");
            },
            success: function (data) {
                alert("Data has been deleted!")
            },
            error: function (error, jqXHR, textStatus, errorThrown) {
                alert("There were errors deleting the data!")

            }
        });
    }


</script>