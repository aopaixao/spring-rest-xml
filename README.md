## Descrição

API Restful, utilizando Spring Boot, com endpoint XML


## Executando a aplicação

```bash
# em ambiente Linux
$ mvn spring-boot:run 

# em ambiente Windows
$ mvnw spring-boot:run 
```

## Enviando um documento XML para a API

# Endpoint: /xml-rest/cd

```bash
# Exemplo de XML

<CATALOG>
<CD>
<TITLE>Empire Burlesque</TITLE>
<ARTIST>Bob Dylan</ARTIST>
<COUNTRY>USA</COUNTRY>
<COMPANY>Columbia</COMPANY>
<PRICE>10.90</PRICE>
<YEAR>1985</YEAR>
</CD>
<CD>
<TITLE>Hide your heart</TITLE>
<ARTIST>Bonnie Tyler</ARTIST>
<COUNTRY>UK</COUNTRY>
<COMPANY>CBS Records</COMPANY>
<PRICE>9.90</PRICE>
<YEAR>1988</YEAR>
</CD>
</CATALOG>


```

## Sobre

- Author - [Alexandre Paixão]

## Licença

GNU GPL

