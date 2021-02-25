(defn valor-descontado
  "Retorna o valor com desconto se o valor bruto for acima de R$ 100"
  [valor-bruto]

  (if (> valor-bruto 100)

    (let [taxa-de-desconto (/ 10 100)
        desconto          (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
      
    valor-bruto))

(valor-descontado 100)