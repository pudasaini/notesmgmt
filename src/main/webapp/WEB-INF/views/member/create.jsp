<%@ taglib prefix="ui" tagdir="/WEB-INF/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<ui:header />
<div class="row">
    <div class="col-lg-12">
        <section class="panel">
            <header class="panel-heading">
                <div class="panel-actions">
                    <a href="#" class="fa fa-caret-down"></a>
                </div>

                <h2 class="panel-title">Create User</h2>
            </header>
            <div class="panel-body">
                <form class="form-horizontal form-bordered" method="post" name="memberform" id="memberform">
                    <input type="hidden" id="id" value="0">


                    <div class="form-group">
                        <label class="col-md-3 control-label" for="fname">First Name</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control" id="fname" name="fname">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-3 control-label" for="lname">Last Name</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control" id="lname" name="lname">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-3 control-label" for="address">Address</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control" id="address" name="address">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-3 control-label" for="contactNo">Contact Number</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control" id="contactNo" name="contactNo">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-3 control-label" for="member_role">Member
                            Role</label>
                        <div class="col-md-6">
                            <select class="form-control input-sm mb-md" name="member_role" id="member_role">
                                <option value="ho">STUDENT</option>
                                <option value="ro">TEACHER</option>
                            </select>
                        </div>
                    </div>





                    <br />
                    <!-- -->
                    <footer class="panel-footer">
                        <div class="row">
                            <div class="col-sm-9 col-sm-offset-3">
                                <button type="button" id ="submitbtn" class="btn btn-primary">Submit</button>
                                <button type="reset" class="btn btn-default">Reset</button>
                            </div>
                        </div>
                    </footer>



                </form>
            </div>
        </section>
    </div>
</div>

<ui:footer />


<script>
function postJsonDataFromApi(url, data) {
   let jsondata = JSON.stringify(data);
      $.ajax({
           type: "POST",
            url: url,
                headers: {
                        "Content-Type": "application/json",
                         "Accept": "application/json"
                          },
         data: jsondata,
         success: function () {
               alert("Data has been posted!");
  },
          error: function () {

         alert("Failed to post data");
           }
});
}
</script>

<script>


    $("#submitbtn").click(

        function() {
            let data = {
                firstName: $("#fname").val(),
                lastName: $("#lname").val(),
                address: $("#address").val(),
                contactNumber: $("#contactNo").val()
                //memberRole : $("#member_role").val()

            };

            postJsonDataFromApi(
                '${pageContext.request.contextPath}/member/', data);
            location.reload(true);

        });
</script>

