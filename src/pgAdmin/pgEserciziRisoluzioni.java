package pgAdmin;

public class pgEserciziRisoluzioni {

	// query su pg admin

	// esercizio1
	// select * from clienti where data_nascita ilike '%1982'

	// esercizio2
	// select * from fatture where iva ilike '20%'

	// esercizio3
	// SELECT COUNT(*) , SUM(importo) FROM fatture GROUP BY data_fattura;

	// esercizio4
	// SELECT * FROM prodotti WHERE data_attivazione ilike '%2017%' and
	// (in_commercio OR in_produzione)

	// esercizio5
	// SELECT COUNT(*) data_fattura FROM fatture WHERE iva ILIKE '%20%' GROUP BY
	// data_fattura
}
