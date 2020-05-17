# DaggerSample

## 目的
Daggerを中心にテスト系を試したり，CIのテスト場として使っています．

### 使用CIツール
GitHub Actions用のymlファイルが残っていますが，Bitriseに移行しました．

#### Work内容
トリガー：masterへのPR
1. [Ktlint](https://ktlint.github.io/)の実行
1. Ktlintの実行結果をDangerを利用して，PRにコメント
1. UI Testとして[Virtual Device Testing for Android](https://devcenter.bitrise.io/testing/device-testing-for-android/)の実行
1. UI Testの実行結果からスクショを外部ストレージに保存
1. 外部ストレージに保存したスクショをPRにコメントとして書き込む

※現状外部ストレージではAmazon S3を使用<br>
※UI Testとして利用しているVirtual Device Testing for AndroidはBETA版となっている
