<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Desenvolvimento Avançado - Segurança da Informação</title>
        <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
        <script src="./resources/bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container" style="padding-top: 80px;">
            <div class="row">
                <div class="container">
                    <div class="col-md-8">
                        <div class="form-group">
                            <h2>Acesso ao Sistema</h2>
                            <p>Preencha as informações de acesso:</p>
                            <br />
                        </div>
                        <form class="form-horizontal" method="get" action="LoginController" role="form">
                            <div class="form-group">
                                <label for="nome" class="col-sm-3 control-label">Nome</label>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" id="nome" name="user" placeholder="Digite aqui seu usuário" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="senha" class="col-sm-3 control-label">Senha</label>
                                <div class="col-sm-4">
                                    <input type="password" id="senha" class="form-control" name="pass" placeholder="Digite aqui sua senha" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-10">
                                    <button type="submit" class="btn btn-default">Efetuar Login</button>
                                </div>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
