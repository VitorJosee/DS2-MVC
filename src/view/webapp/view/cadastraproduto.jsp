<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Produto</title>
</head>
<body>
<jsp:include page="layouttopo.jsp"></jsp:include>
  <form method="POST" action="/cadastraproduto">
  
  <div class="mb-3">
    <label for="descricao" class="form-label">Descrição</label>
    <input type="text" class="form-control" id="descricao" name="descricao">
  </div>
  
   <div class="mb-3">
    <label for="quantidade" class="form-label">Quantidade</label>
    <input type="text" class="form-control" id="quantidade" name="quantidade">
  </div>
  
  
   <div class="mb-3">
    <label for="valor" class="form-label">Valor</label>
    <input type="text" class="form-control" id="valor" name="valor">
  </div>
  
   <button type="submit" class="btn btn-primary">Submit</button>
   
  </form>
  
</body>

<jsp:include page="layoutrodape.jsp"></jsp:include>

</html>