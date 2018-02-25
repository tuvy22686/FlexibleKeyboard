# FlexibleKeyboard
created at 2018/02/09

## バージョン
* Android Studio 3.0.1
* target api19~26

## 説明
本アプリ内で動くキーボードを作成するアプリ  
タブレット向け

## Todo
* 画面
    * [x] チュートリアル
    * [ ] ホームポジション設定
    * [ ] キーボード
    * [ ] 入力確認用文字列の表示
    * [ ] 入力確認用文字列のインジケーター

## Activity構成
* `MainActivity`: チュートリアル
    * `TutorialStartFragment`
    * `TutorialEndFragment`
* `SetupHomePositionActivity`: ホームポジション設定
    * `SetupHomePositionViewModel`