# OpenSAML 5 と Quarkus

これは、OpenSAML 5 と Quarkus の使用方法を示すシンプルなプロジェクトで、Quarkus のセキュリティと組み合わせて SAML を使用したユーザーログインの方法を実演します。

OpenSAML5 は Jakarta ベースで、Quarkus の WebServlet アノテーションと非常によく連携します。

- ログインエンドポイント: http://localhost:8080/SAML2/login
- アサートエンドポイント: http://localhost:8080/SAML2/assert
- オープンエンドポイント: http://localhost:8080/countries/open
- 保護されたエンドポイント: http://localhost:8080/countries/closed

## 開発モードでアプリケーションを実行する

以下のコマンドを使用して、開発モードでアプリケーションを実行できます:

```shell script
./mvnw compile quarkus:dev
```
