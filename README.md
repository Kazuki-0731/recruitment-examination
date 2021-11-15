# 電卓の作成
## 要件
* 自然数同士の２項による四則計算

## 設計
### MVVM

Google公式のMVVMアーキテクチャを参考にしています
* https://github.com/android/architecture-components-samples/tree/master


## 画面構成
|　　　　　　　画面名　　　　　　　| キャプチャ画像 | 
| :------------------: | :--: |
| 電卓画面 | <img src="https://user-images.githubusercontent.com/28224709/141817145-38312a6d-5f39-4fbf-8b5c-6ff5af63a32f.png" width="30%"> |
| 0除算エラーダイアログ | <img src="https://user-images.githubusercontent.com/28224709/141817661-0b7746a9-c7ee-4a72-8620-866af7783717.png" width="30%"> |
| 2項目未入力エラーダイアログ | <img src="https://user-images.githubusercontent.com/28224709/141818143-0d3065c5-c644-47eb-b9b9-e5d7e4e17c95.png" width="30%"> |
| Int型最大値エラーダイアログ | <img src="https://user-images.githubusercontent.com/28224709/141818359-4f174334-1188-470b-90f4-54dd2d6f4554.png" width="30%"> |

## テスト実行結果
`ExampleUnitTest`に記載したテストコードの実行結果です。

<img src="https://user-images.githubusercontent.com/28224709/141819152-1da32a7a-a767-4f9a-8eeb-1bd95e502142.png" width="90%">

