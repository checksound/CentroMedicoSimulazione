# Simulazione Centro Medico

Dieci pazienti si recano periodicamente al centro medico dove ci sono 
due medici che li visitano. 

Ogni medico fa entrare, per visitare, un paziente alla volta 
tra quelli che aspettano in sala d'aspetto. 

Quando un paziente è stato visitato dal medico viene dimesso 
e può in seguito ritornare, quando vuole, dal medico.

I pazienti non possono entrare direttamente dal medico ma devono prima 
passare dalla sala d'aspetto. 

Ogni medico se non ha nessuno da visitare in quel momento (la sala d'aspetto
è vuota) va a prendersi il caffè.

La sala d'aspetto ha solo 4 posti. 

I pazienti sono 10 e una volta che sono stati dimessi aspettano dai 2 agli 
20 secondi per ritornare.

I medici per visitare un paziente ci mettono dai 2 ai 6 secondi.

Il medico sta in pausa caffè per minimo 2 secondi e massimo 4 secondi poi 
torna al proprio lavoro.

Chiamare i pazienti 'Paziente1', 'Paziente2', .......'Paziente9'
Chiamare i medici 'Medico1' e 'Medico2'.

Da mettere i messaggi del medico con 'nome medico' e il messaggio INIZIO PAUSA e 
FINE PAUSA.
Quando il medico inizia a visitare il paziente e quando finisce il paziente. 
Quando il paziente (con 'nome paziente') entra in sala d'aspetto.

Esempio di log:
```
Medico: Medico1, INIZIA LA PAUSA
Medico: Medico2, INIZIA LA PAUSA
Paziente Paziente7 entrato in sala aspetto
Paziente Paziente5 entrato in sala aspetto
Paziente Paziente1 entrato in sala aspetto
Paziente Paziente2 entrato in sala aspetto
Medico: Medico2, FINISCE LA PAUSA
Medico: Medico1, FINISCE LA PAUSA
Paziente Paziente9 entrato in sala aspetto
Paziente Paziente3 entrato in sala aspetto
Medico: Medico2 inizia visita paziente: Paziente2
Medico: Medico1 inizia visita paziente: Paziente1
Medico: Medico1 FINITA visita paziente: Paziente1
Medico: Medico2 FINITA visita paziente: Paziente2
Medico: Medico1 inizia visita paziente: Paziente5
Paziente Paziente6 entrato in sala aspetto
Medico: Medico2 inizia visita paziente: Paziente7
Paziente Paziente8 entrato in sala aspetto
Medico: Medico2 FINITA visita paziente: Paziente7
Medico: Medico1 FINITA visita paziente: Paziente5
Medico: Medico2 inizia visita paziente: Paziente9
Paziente Paziente4 entrato in sala aspetto
Medico: Medico1 inizia visita paziente: Paziente3
Paziente Paziente10 entrato in sala aspetto
Medico: Medico2 FINITA visita paziente: Paziente9
Medico: Medico1 FINITA visita paziente: Paziente3
Medico: Medico1 inizia visita paziente: Paziente8
Medico: Medico2 inizia visita paziente: Paziente6
Medico: Medico1 FINITA visita paziente: Paziente8
Medico: Medico1 inizia visita paziente: Paziente4
Medico: Medico2 FINITA visita paziente: Paziente6
Medico: Medico2 inizia visita paziente: Paziente10
Medico: Medico1 FINITA visita paziente: Paziente4
Medico: Medico1, INIZIA LA PAUSA
Medico: Medico2 FINITA visita paziente: Paziente10
Medico: Medico2, INIZIA LA PAUSA
Medico: Medico1, FINISCE LA PAUSA
Medico: Medico2, FINISCE LA PAUSA
Paziente Paziente5 entrato in sala aspetto
Medico: Medico1 inizia visita paziente: Paziente5
Paziente Paziente1 entrato in sala aspetto
Paziente Paziente2 entrato in sala aspetto
Paziente Paziente7 entrato in sala aspetto
Medico: Medico2 inizia visita paziente: Paziente7
Medico: Medico1 FINITA visita paziente: Paziente5
Medico: Medico2 FINITA visita paziente: Paziente7
```








