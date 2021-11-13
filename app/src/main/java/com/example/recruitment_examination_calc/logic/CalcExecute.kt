package com.example.recruitment_examination_calc.logic

object CalcExecute {
    /**
     * 二項計算
     * @param inputA
     * @param inputB
     * @param operator
     * @return result
     */
    @JvmStatic
    fun twoItemsCalc(inputA: Int, inputB: Int, operator: String): Int {
        var result = 0
        when (operator) {
            "+" -> result = inputA + inputB
            "-" -> result = inputA - inputB
            "*" -> result = inputA * inputB
            "/" -> result = inputA / inputB
        }
        return result
    }

    /**
     * 四則演算実行
     *
     * 例：1 + 2 * 3 - 4
     *
     * 手順
     * 1. 先に「2 * 3」を行う
     * 2. 計算結果を配列に上書き
     * 3. 引き算を足し算して、-1倍
     * 4. 最後に足し算をループ
     * 5. 結果出力
     *
     * 余力があった時用に作成
     * - UIとの連携実装はしていない
     */
    @JvmStatic
    fun executionOfFourArithmeticOperators(
        numbers: ArrayList<Double>,
        operations: ArrayList<Char>
    ) : Double {
        var i = 0
        while (i < operations.size) {
            if(operations[i] == '*' || operations[i] == '/') {
                //先に掛け算、割り算を前から順に行う
                var result = if (operations[i] == '*') numbers[i] * numbers[i+1] else numbers[i] / numbers[i+1]
                //計算に使った一つ目の数を計算結果に置き換え
                numbers[i] = result
                //二つ目の数をリストから削除
                numbers.removeAt(i+1)
                //使い終わった演算子をリストから削除
                operations.removeAt(i)
                i--
            } else if(operations[i] == '-') {
                // 引き算を足し算に変える
                operations[i] = '+'
                //引く数を-1倍
                numbers[i+1] = numbers[i+1] * -1
            }
            i++
        }

        // 足し算だけ残るので、リストに残った数を合計する
        var result = 0.0
        for (i in numbers){
            result += i
        }
        return result
    }
}