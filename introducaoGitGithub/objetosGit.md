# Organização interna (objetos) do Git



## Blobs

Contém arquivos e metadados

{Tipo:Blob, Tamanho: em bytes, \O, Conteúdo}

Por causa dos metadados o sha1 do Blob é diferente do Sha1 só do conteúdo.

Se não me engano 1 Blob faz referência a uma alteração de arquivo (diff) e não ao arquivo inteiro (com exceção do momento de criação). [] Confirmar



## Trees

Armazena referência (Sha1) de vários Blobs ou para outras Trees, mais metadados.

{Type:Tree, Tamanho: , \o, objetos:{Blobs ou Trees}, nomeArquivo:}



## Commit

Objeto que Marca uma alteração "definitiva" no repositório permitindo a criação de seu histórico ou o retorno de estados anteriores no tempo.

{tree, parent, autor, mensagem, timestamp}