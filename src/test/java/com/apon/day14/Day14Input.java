package com.apon.day14;

public class Day14Input {
    public static final String EXAMPLE_INPUT = "mask = XXXXXXXXXXXXXXXXXXXXXXXXXXXXX1XXXX0X\n" +
            "mem[8] = 11\n" +
            "mem[7] = 101\n" +
            "mem[8] = 0";

    public static final String PART2_EXAMPLE_INPUT = "mask = 000000000000000000000000000000X1001X\n" +
            "mem[42] = 100\n" +
            "mask = 00000000000000000000000000000000X0XX\n" +
            "mem[26] = 1";

    public static final String INPUT = "mask = X10X11X1000101X1XX001100001X101X0111\n" +
            "mem[27041] = 56559\n" +
            "mem[43069] = 56082467\n" +
            "mem[55125] = 25536\n" +
            "mem[13313] = 3968\n" +
            "mask = 0X01110110X10101X01100110000X0X010X0\n" +
            "mem[51810] = 586700041\n" +
            "mem[5546] = 73582083\n" +
            "mem[64563] = 1709385\n" +
            "mask = X10X1X01000X1XXX1011010X0101001X1100\n" +
            "mem[55081] = 164951\n" +
            "mem[57902] = 941479\n" +
            "mem[64412] = 168227\n" +
            "mem[38991] = 7285\n" +
            "mem[32442] = 4026389\n" +
            "mem[13462] = 11389\n" +
            "mask = 100XX0010X000001X1X1000110011X000011\n" +
            "mem[30898] = 16273\n" +
            "mem[58759] = 129155\n" +
            "mem[32283] = 16275\n" +
            "mem[40822] = 5428787\n" +
            "mask = 1101110X1101011XX10100111101XX1X0011\n" +
            "mem[49575] = 64412\n" +
            "mem[27128] = 4116\n" +
            "mem[44802] = 1524861\n" +
            "mem[64022] = 21246\n" +
            "mem[43630] = 40764\n" +
            "mask = 1X0X110111010XX111010111X101X0011011\n" +
            "mem[48341] = 23417\n" +
            "mem[53479] = 235442\n" +
            "mem[18336] = 94965893\n" +
            "mem[57351] = 162640\n" +
            "mem[57629] = 1482328\n" +
            "mem[26659] = 30905751\n" +
            "mask = XX0010001X0000011111X1X111X10X11X0X1\n" +
            "mem[24841] = 117268\n" +
            "mem[40922] = 620521271\n" +
            "mem[15784] = 9554135\n" +
            "mem[34841] = 73813\n" +
            "mem[26214] = 1046646796\n" +
            "mem[51219] = 342\n" +
            "mask = 01011X010001X11111010110X1000000011X\n" +
            "mem[30384] = 10767\n" +
            "mem[30180] = 3038\n" +
            "mem[41792] = 1794799\n" +
            "mem[22454] = 141484\n" +
            "mem[8961] = 138657\n" +
            "mask = 1X01010100001X11100100X000X00000X1X0\n" +
            "mem[62834] = 21881\n" +
            "mem[32225] = 113149539\n" +
            "mem[50218] = 84165\n" +
            "mem[39558] = 216497715\n" +
            "mask = 01X0010XX00011X1X0011X001000XX110011\n" +
            "mem[58102] = 854\n" +
            "mem[30215] = 3351\n" +
            "mem[33733] = 166\n" +
            "mem[5725] = 12102\n" +
            "mem[40925] = 663163\n" +
            "mem[4700] = 11609\n" +
            "mem[46222] = 247699901\n" +
            "mask = XX110X11010101101101001XXX1X1X100011\n" +
            "mem[25668] = 1311480\n" +
            "mem[15110] = 43047\n" +
            "mem[20494] = 621\n" +
            "mem[42552] = 885\n" +
            "mem[676] = 440298427\n" +
            "mem[47591] = 1439872\n" +
            "mem[44891] = 239995\n" +
            "mask = 11011XXX0100X001X10X10010110010X11X1\n" +
            "mem[7814] = 84184\n" +
            "mem[54268] = 2433599\n" +
            "mem[50873] = 11428\n" +
            "mem[20156] = 42428\n" +
            "mem[4576] = 13692368\n" +
            "mask = 11010X01100001X110X1X10001X101101X10\n" +
            "mem[40524] = 798\n" +
            "mem[47191] = 3260486\n" +
            "mem[18798] = 86012101\n" +
            "mem[41247] = 21300057\n" +
            "mem[54268] = 74197872\n" +
            "mem[53415] = 68475\n" +
            "mask = 010X1100100X1100X1010011X0X0X0011101\n" +
            "mem[15154] = 7956\n" +
            "mem[43012] = 897\n" +
            "mem[58152] = 25845\n" +
            "mem[766] = 172082371\n" +
            "mem[52128] = 31341204\n" +
            "mask = 1X00X00X110000X111X110XX0111001X0X11\n" +
            "mem[23567] = 917031\n" +
            "mem[35639] = 1135\n" +
            "mem[46408] = 26253\n" +
            "mem[51984] = 269805971\n" +
            "mem[18161] = 145505\n" +
            "mask = 010X100101010X1110X10XX00X11001X0110\n" +
            "mem[39575] = 59052182\n" +
            "mem[44818] = 1753773\n" +
            "mem[54049] = 9062079\n" +
            "mem[7021] = 23033\n" +
            "mask = 1101110111000X0111000010X1010100XX00\n" +
            "mem[1943] = 61503738\n" +
            "mem[61496] = 4688484\n" +
            "mem[12496] = 3724\n" +
            "mem[43497] = 64222\n" +
            "mem[53687] = 7996\n" +
            "mask = 11XXX0010X00001X10XX0000010X0111011X\n" +
            "mem[435] = 14192652\n" +
            "mem[3765] = 846967\n" +
            "mem[61166] = 13875665\n" +
            "mask = 0100010110001X111XXXX100000001010111\n" +
            "mem[3750] = 1921\n" +
            "mem[40035] = 7716582\n" +
            "mem[59566] = 993057\n" +
            "mem[57732] = 1389\n" +
            "mask = 0100000110X00110X100011001XX1X011010\n" +
            "mem[40412] = 246706\n" +
            "mem[63492] = 18123\n" +
            "mem[25668] = 53187\n" +
            "mem[21553] = 25476\n" +
            "mem[30692] = 36784\n" +
            "mem[3183] = 32438\n" +
            "mask = 110X0101X000X11110X11000X010100XX11X\n" +
            "mem[38615] = 506\n" +
            "mem[24603] = 737880\n" +
            "mem[21866] = 390846\n" +
            "mem[4108] = 2001313\n" +
            "mem[44257] = 31442716\n" +
            "mem[41468] = 7966\n" +
            "mem[57394] = 783646\n" +
            "mask = 0X011001100X00111X0110110001X1011101\n" +
            "mem[24387] = 10182\n" +
            "mem[31736] = 115136274\n" +
            "mem[28984] = 2353\n" +
            "mem[2475] = 109336\n" +
            "mask = 110X100X0X00000X1001100X100010000101\n" +
            "mem[51542] = 8298665\n" +
            "mem[57871] = 101098400\n" +
            "mem[50403] = 10935230\n" +
            "mem[22710] = 1959\n" +
            "mem[37641] = 114119\n" +
            "mask = 11X1010X100001X110X110001100X0110011\n" +
            "mem[57394] = 29625020\n" +
            "mem[11168] = 1029\n" +
            "mem[9347] = 1826\n" +
            "mem[11334] = 594\n" +
            "mem[62531] = 2201943\n" +
            "mask = 0X1X01010101X11X1101111X1X00X1010111\n" +
            "mem[41378] = 58920\n" +
            "mem[27145] = 554\n" +
            "mem[60014] = 7131\n" +
            "mask = 11XXX1110X00000X0101100101X0011001X1\n" +
            "mem[28366] = 290247\n" +
            "mem[63097] = 177936\n" +
            "mem[18333] = 14036\n" +
            "mask = 10011X0010X110111011010010X10X001100\n" +
            "mem[52923] = 65816388\n" +
            "mem[23341] = 9880982\n" +
            "mem[15175] = 22538\n" +
            "mask = X101X0110X0100111X10111110100XX10X01\n" +
            "mem[62215] = 13184563\n" +
            "mem[13801] = 49239763\n" +
            "mem[12496] = 892859\n" +
            "mem[37788] = 7710\n" +
            "mem[60433] = 8951271\n" +
            "mask = X11100010X00X010X0000X00000001110110\n" +
            "mem[18584] = 1767\n" +
            "mem[1250] = 44242023\n" +
            "mem[54337] = 1202\n" +
            "mem[16284] = 7015\n" +
            "mask = 11X1X1011000X11X10011010X1X0X00100X1\n" +
            "mem[63358] = 13288368\n" +
            "mem[42217] = 107319\n" +
            "mem[27988] = 123244922\n" +
            "mem[33860] = 182239\n" +
            "mem[40015] = 857415\n" +
            "mem[9829] = 1552\n" +
            "mask = 0101X101100X110X101110X1XX000X0101XX\n" +
            "mem[5707] = 623141\n" +
            "mem[63170] = 3540\n" +
            "mem[49303] = 5946356\n" +
            "mem[34003] = 31894390\n" +
            "mask = 0X010000010001XX1X0101000XXXX000X011\n" +
            "mem[65195] = 9789\n" +
            "mem[49527] = 35294934\n" +
            "mem[61780] = 27702\n" +
            "mem[15175] = 12753075\n" +
            "mem[19444] = 312835\n" +
            "mem[30215] = 26235\n" +
            "mem[56607] = 1184\n" +
            "mask = X101110X1001X00X1011XX01111X00000100\n" +
            "mem[11529] = 202692\n" +
            "mem[7212] = 12087618\n" +
            "mem[13649] = 4152\n" +
            "mem[54165] = 36475777\n" +
            "mem[3587] = 59730191\n" +
            "mask = X10111011101X0X11101111110X100100101\n" +
            "mem[32820] = 988109\n" +
            "mem[58886] = 774558\n" +
            "mem[19222] = 37482\n" +
            "mask = 11010XX1X000011X10110000100001011010\n" +
            "mem[56490] = 41313\n" +
            "mem[60014] = 24800\n" +
            "mem[60019] = 3393\n" +
            "mask = X1000101100011X1X001X1101000000101X1\n" +
            "mem[59526] = 266367133\n" +
            "mem[4762] = 740776\n" +
            "mem[2900] = 137498\n" +
            "mem[19079] = 61895\n" +
            "mem[33262] = 4863\n" +
            "mask = X1011X0XX0X0X11010011X00100011X01X10\n" +
            "mem[48337] = 1047\n" +
            "mem[7814] = 11885727\n" +
            "mem[30993] = 170945\n" +
            "mem[39628] = 1313283\n" +
            "mask = 110X01011000011X100X1101X100X00X0001\n" +
            "mem[46408] = 156741\n" +
            "mem[52622] = 3088962\n" +
            "mem[15423] = 518000\n" +
            "mem[64701] = 514808438\n" +
            "mask = 110101X110000X1X10X11010X110011X1111\n" +
            "mem[43254] = 387\n" +
            "mem[58713] = 8724789\n" +
            "mem[26335] = 544255113\n" +
            "mem[11424] = 47914958\n" +
            "mem[36656] = 224193\n" +
            "mask = 010000XXX0X0011110X10110000X01001X01\n" +
            "mem[63579] = 52105299\n" +
            "mem[37046] = 1134\n" +
            "mask = 11111X0110001X10X001X111X10100111111\n" +
            "mem[61324] = 31303686\n" +
            "mem[64060] = 1610\n" +
            "mem[39793] = 1958162\n" +
            "mem[46164] = 668042\n" +
            "mem[16116] = 13803\n" +
            "mem[35215] = 448312344\n" +
            "mask = X10101X1100011111001101001X0110001X1\n" +
            "mem[7844] = 760372\n" +
            "mem[44693] = 16675\n" +
            "mem[11334] = 16652\n" +
            "mask = 011101X1010101111XX110010101X01X0011\n" +
            "mem[47181] = 37171\n" +
            "mem[57629] = 49275889\n" +
            "mem[18322] = 500908019\n" +
            "mem[46549] = 834444470\n" +
            "mem[13951] = 574868\n" +
            "mem[26538] = 787853\n" +
            "mask = XX011X011100X00111X1X0X001X011X11010\n" +
            "mem[64949] = 162355279\n" +
            "mem[57407] = 3350\n" +
            "mem[43929] = 203041\n" +
            "mask = 1101101100X100110X010001101000110XX1\n" +
            "mem[32532] = 32712949\n" +
            "mem[51621] = 1546586\n" +
            "mem[22570] = 251922029\n" +
            "mem[10937] = 3154069\n" +
            "mem[25790] = 49139\n" +
            "mask = 01011101XX0111X110111011XXX01001010X\n" +
            "mem[24482] = 117679\n" +
            "mem[60433] = 714\n" +
            "mem[23257] = 69062735\n" +
            "mem[28676] = 15016259\n" +
            "mem[32334] = 4194426\n" +
            "mask = 0X000101100001101001XX101111010101X1\n" +
            "mem[31956] = 796\n" +
            "mem[28984] = 1446991\n" +
            "mem[39810] = 27358954\n" +
            "mem[9234] = 19734706\n" +
            "mem[45123] = 247705194\n" +
            "mem[34003] = 35251\n" +
            "mem[16180] = 804679\n" +
            "mask = 1101XXX00000011010X0111010X010010000\n" +
            "mem[13595] = 284\n" +
            "mem[39575] = 14805\n" +
            "mem[41940] = 27710\n" +
            "mem[48667] = 118527\n" +
            "mem[43689] = 5996\n" +
            "mem[55758] = 3036117\n" +
            "mask = 11011XX10101010111011110000100010X0X\n" +
            "mem[10468] = 8121\n" +
            "mem[45166] = 970006437\n" +
            "mask = 11011001X10000X11XX1XXX00XX011000011\n" +
            "mem[18583] = 2551\n" +
            "mem[32334] = 2009\n" +
            "mem[27128] = 56668016\n" +
            "mem[52052] = 750760\n" +
            "mem[49527] = 46604\n" +
            "mem[49214] = 1061\n" +
            "mem[1791] = 11556\n" +
            "mask = 1X0X0101X000011X1X0100110X001001X011\n" +
            "mem[12346] = 178717508\n" +
            "mem[52270] = 311954237\n" +
            "mem[49864] = 7470000\n" +
            "mask = X101010110000X1X10011X01XX101XX11010\n" +
            "mem[37530] = 80\n" +
            "mem[32958] = 28577227\n" +
            "mem[40585] = 8221\n" +
            "mem[57579] = 1646\n" +
            "mem[50218] = 7908\n" +
            "mask = 010011011X0101X100X10001001X00000111\n" +
            "mem[50694] = 457\n" +
            "mem[13360] = 62444656\n" +
            "mem[4404] = 1266571\n" +
            "mask = X101110X00X110X11X1110X1X011101001XX\n" +
            "mem[23104] = 253935942\n" +
            "mem[14852] = 2270\n" +
            "mem[34981] = 1108\n" +
            "mem[53840] = 146384561\n" +
            "mem[47509] = 60247\n" +
            "mem[23085] = 51902845\n" +
            "mem[58655] = 9691\n" +
            "mask = 1X0XXX1100X1X0110X01111X1110000001X1\n" +
            "mem[60433] = 128268\n" +
            "mem[57082] = 816691399\n" +
            "mem[45011] = 80982\n" +
            "mem[39218] = 1071426371\n" +
            "mask = 11010X011000XX101001X01100001101010X\n" +
            "mem[35350] = 8809868\n" +
            "mem[9433] = 65247\n" +
            "mem[38801] = 2086\n" +
            "mask = 11011101X10XX00X110XX00001X0X110X101\n" +
            "mem[54049] = 8667\n" +
            "mem[46876] = 435193\n" +
            "mem[43949] = 15176016\n" +
            "mem[44664] = 26159\n" +
            "mem[23255] = 895\n" +
            "mask = 01X1X1X1010101111101001111X1X101X1X1\n" +
            "mem[61166] = 504606\n" +
            "mem[61956] = 20721\n" +
            "mem[39929] = 1403\n" +
            "mask = X10X010110000X1110011010110X11110001\n" +
            "mem[40015] = 700480\n" +
            "mem[36436] = 4893\n" +
            "mem[32266] = 25534\n" +
            "mem[41902] = 2988\n" +
            "mem[39810] = 28\n" +
            "mem[41370] = 57925\n" +
            "mem[12356] = 297319\n" +
            "mask = X101111101010XX111X1X01X1X0101X1010X\n" +
            "mem[37641] = 9726\n" +
            "mem[59076] = 168552\n" +
            "mem[45749] = 1746884\n" +
            "mem[17712] = 69612\n" +
            "mem[49214] = 867128713\n" +
            "mem[61637] = 40856300\n" +
            "mem[33365] = 1428019\n" +
            "mask = 1101110X1000X1111X0110001X0001010100\n" +
            "mem[13072] = 10041\n" +
            "mem[53702] = 773477\n" +
            "mem[44645] = 2404420\n" +
            "mem[45439] = 5964\n" +
            "mem[58658] = 208590\n" +
            "mem[44798] = 19402244\n" +
            "mask = 110X11X1100X0111100110001X00X10000X1\n" +
            "mem[10421] = 171265821\n" +
            "mem[12356] = 680301\n" +
            "mem[22675] = 21609725\n" +
            "mask = 011X0111X101011X1X010XX100X010X001X1\n" +
            "mem[32543] = 354353\n" +
            "mem[46511] = 2359\n" +
            "mem[19545] = 27624\n" +
            "mem[27128] = 48860350\n" +
            "mem[4352] = 97594900\n" +
            "mem[7423] = 256\n" +
            "mask = 100XX001010000X11X111X0010X00XX10X10\n" +
            "mem[9234] = 14199\n" +
            "mem[20857] = 105139600\n" +
            "mem[8485] = 397519358\n" +
            "mem[56314] = 191575\n" +
            "mem[56707] = 14956\n" +
            "mem[53089] = 289600\n" +
            "mem[21001] = 13079705\n" +
            "mask = 010111011001XX01X0111001X0XX1001XX0X\n" +
            "mem[106] = 21541596\n" +
            "mem[12371] = 3644659\n" +
            "mem[50177] = 205339532\n" +
            "mem[1812] = 473555543\n" +
            "mem[22675] = 1216737\n" +
            "mask = 1X011001010000X1101100001X1X01X101XX\n" +
            "mem[27858] = 4008\n" +
            "mem[51566] = 49154\n" +
            "mem[4762] = 16827\n" +
            "mem[53603] = 472698\n" +
            "mem[23186] = 5880\n" +
            "mem[53599] = 989\n" +
            "mask = X10X0101100000111001X1XX0X00X1000110\n" +
            "mem[49118] = 921\n" +
            "mem[34859] = 802\n" +
            "mem[55335] = 213213436\n" +
            "mem[12356] = 90675624\n" +
            "mem[34362] = 1372\n" +
            "mem[30455] = 1338\n" +
            "mask = 010100110000001XX001X101011101X1X100\n" +
            "mem[12601] = 13719557\n" +
            "mem[6055] = 1675\n" +
            "mem[22570] = 918\n" +
            "mem[52622] = 2656587\n" +
            "mem[45642] = 5143\n" +
            "mem[16015] = 11484862\n" +
            "mask = 1101X0010100X011X1X100X0X100XX11X111\n" +
            "mem[19222] = 424\n" +
            "mem[59273] = 29846629\n" +
            "mem[17113] = 7689\n" +
            "mem[48356] = 4606\n" +
            "mask = 010X1101X00101010011X00100XXXX1X0X10\n" +
            "mem[15158] = 3693\n" +
            "mem[4535] = 32872078\n" +
            "mem[42138] = 9199883\n" +
            "mem[61166] = 328197677\n" +
            "mem[25980] = 210\n" +
            "mem[38567] = 238946499\n" +
            "mask = X10XX0000X00011X100X1011000111X1X11X\n" +
            "mem[56158] = 7060\n" +
            "mem[1355] = 4692\n" +
            "mem[15605] = 13671929\n" +
            "mem[22570] = 1896780\n" +
            "mem[25653] = 62047211\n" +
            "mem[49303] = 143257122\n" +
            "mask = 1XX11100X01110111011X0X11X11X01000X0\n" +
            "mem[47139] = 5173\n" +
            "mem[33745] = 500428082\n" +
            "mem[55823] = 311\n" +
            "mem[1250] = 296582\n" +
            "mem[63703] = 949\n" +
            "mask = X1011101000X1X0110110X1X0X0110X00110\n" +
            "mem[51810] = 18035546\n" +
            "mem[53428] = 3886\n" +
            "mem[64949] = 645\n" +
            "mem[52996] = 41172825\n" +
            "mem[49452] = 1367\n" +
            "mask = 110XXX011X000X011111110XX010X10X0011\n" +
            "mem[17565] = 16592\n" +
            "mem[49575] = 3981067\n" +
            "mem[4250] = 300364\n" +
            "mem[35350] = 8178\n" +
            "mem[22007] = 21898575\n" +
            "mask = 010X01X110000X101011X001011X111X1X10\n" +
            "mem[18950] = 13300\n" +
            "mem[4487] = 612\n" +
            "mem[12388] = 412719717\n" +
            "mem[44693] = 3118\n" +
            "mask = 1101X10110X0011010010X0100101010X000\n" +
            "mem[48867] = 17605927\n" +
            "mem[8397] = 1860772\n" +
            "mem[39018] = 550228\n" +
            "mem[38250] = 47809475\n" +
            "mem[2450] = 116013203\n" +
            "mem[49776] = 393349\n" +
            "mask = 1101X10110000X11100111X101101100X010\n" +
            "mem[53450] = 656535467\n" +
            "mem[6408] = 21122\n" +
            "mem[40154] = 1342486\n" +
            "mask = 1101100X010X101X0111000101000X101111\n" +
            "mem[4324] = 686588689\n" +
            "mem[64022] = 1565401\n" +
            "mem[35893] = 9127\n" +
            "mem[63924] = 5346\n" +
            "mask = X1011X01XX0X0X111X0111101111X00X0111\n" +
            "mem[18336] = 33319783\n" +
            "mem[9347] = 7493509\n" +
            "mem[6227] = 1816\n" +
            "mem[31665] = 5514016\n" +
            "mem[51408] = 4879\n" +
            "mem[53450] = 114937\n" +
            "mask = 010100XX000000XX10011X0X0011XX011000\n" +
            "mem[46925] = 103\n" +
            "mem[57394] = 965124\n" +
            "mem[15985] = 980924\n" +
            "mem[52270] = 110464\n" +
            "mem[15394] = 1276\n" +
            "mask = XX000100X0X01101X10100XX0XX000001011\n" +
            "mem[13230] = 1399497\n" +
            "mem[64578] = 3309\n" +
            "mem[25149] = 7933\n" +
            "mask = 01010101100X101110X1X00XX00X1111X0X1\n" +
            "mem[16284] = 27584023\n" +
            "mem[46579] = 360009595\n" +
            "mem[30484] = 677717\n" +
            "mem[11059] = 52513896\n" +
            "mem[38700] = 683\n" +
            "mask = 110110X1000X0X11X1XXX11X1000000X0111\n" +
            "mem[16164] = 177\n" +
            "mem[8961] = 6185342\n" +
            "mem[53026] = 72900939\n" +
            "mask = 1XX11X0111001XX11111010X010011111X00\n" +
            "mem[59825] = 37712\n" +
            "mem[42879] = 746543\n" +
            "mem[16391] = 54454690\n" +
            "mem[43036] = 346868\n" +
            "mem[25030] = 38931\n" +
            "mem[5215] = 890634260\n" +
            "mask = 1101110X00001001101111X0XX11001XX100\n" +
            "mem[19490] = 5726\n" +
            "mem[17000] = 16738\n" +
            "mem[61693] = 7616\n" +
            "mem[2295] = 1627\n" +
            "mem[44236] = 269\n" +
            "mem[4389] = 1030099\n" +
            "mem[11170] = 4961\n" +
            "mask = 010X1101101X01011X1110X1X10010X0001X\n" +
            "mem[27835] = 16102\n" +
            "mem[12301] = 8157\n" +
            "mem[38801] = 32685079\n" +
            "mask = X1011101000100111X01011X101110X00111\n" +
            "mem[64949] = 21205\n" +
            "mem[56917] = 416029376\n" +
            "mem[50979] = 2487904\n" +
            "mem[64022] = 2045\n" +
            "mem[13313] = 804618\n" +
            "mem[55628] = 17126\n" +
            "mask = X1010101100X110110X1111X0X00XX0X010X\n" +
            "mem[39628] = 924\n" +
            "mem[39127] = 3978399\n" +
            "mem[36741] = 1917293\n" +
            "mem[62950] = 6997\n" +
            "mask = 01110101010101111X01101XX111X1X0010X\n" +
            "mem[20491] = 500\n" +
            "mem[36269] = 22639420\n" +
            "mem[44179] = 725\n" +
            "mem[48503] = 520056\n" +
            "mem[7514] = 28103\n" +
            "mem[54438] = 410686\n" +
            "mask = 0101XX0X10001X01X01110101100000111X1\n" +
            "mem[45749] = 494350\n" +
            "mem[44246] = 3578\n" +
            "mem[15900] = 1654\n" +
            "mem[32209] = 218393668\n" +
            "mem[30484] = 213583441\n" +
            "mem[25092] = 55738\n" +
            "mask = 01000X011000011X1X0X010100XXXX011110\n" +
            "mem[39783] = 25297\n" +
            "mem[60998] = 35841298\n" +
            "mem[54570] = 2329\n" +
            "mem[41435] = 43307534\n" +
            "mem[55264] = 375757\n" +
            "mem[63681] = 112957\n" +
            "mask = 1101010XX000X1101001101000XX00X1X001\n" +
            "mem[55707] = 16304353\n" +
            "mem[14995] = 11351\n" +
            "mem[12346] = 746754510\n" +
            "mem[11376] = 339\n" +
            "mem[2762] = 51886\n" +
            "mem[26983] = 4316816\n" +
            "mask = 0100X101100001XX1011100101X010111100\n" +
            "mem[25172] = 183861621\n" +
            "mem[5742] = 14878506\n" +
            "mask = X10X01011000X1X010X110X0XX1X01010110\n" +
            "mem[51566] = 2828\n" +
            "mem[18567] = 265\n" +
            "mem[16314] = 423578\n" +
            "mem[5215] = 239\n" +
            "mem[42065] = 2230191\n" +
            "mask = 010X1X010X0X0111X00X1110X001XX010111\n" +
            "mem[10367] = 9431\n" +
            "mem[23257] = 10057\n" +
            "mem[37558] = 789\n" +
            "mem[2683] = 83395426\n" +
            "mem[19984] = 148832616\n" +
            "mask = 110X0101110X0X0111111000001001XX10XX\n" +
            "mem[47509] = 998\n" +
            "mem[41953] = 20146419\n" +
            "mem[44664] = 302148902\n" +
            "mem[63696] = 1160792\n" +
            "mem[17933] = 98120645\n" +
            "mem[49199] = 931033\n" +
            "mem[7279] = 20085\n" +
            "mask = 11X10101X0XX111X101110100X10XX001010\n" +
            "mem[34951] = 7290\n" +
            "mem[40015] = 39139\n" +
            "mem[36460] = 53336927\n" +
            "mask = 0100X10X1000110X1X01X1110X1X0X1100X1\n" +
            "mem[45422] = 1972\n" +
            "mem[54204] = 3976851\n" +
            "mem[53302] = 100688\n" +
            "mem[39162] = 179175\n" +
            "mem[46756] = 354581686\n" +
            "mem[30570] = 4338666\n" +
            "mask = XX01X0X1000X0X11X001011001100XX10101\n" +
            "mem[57138] = 9547723\n" +
            "mem[32548] = 17740188\n" +
            "mem[62284] = 300055571\n" +
            "mask = 010X01011000XXXX1001101X00X01001XX01\n" +
            "mem[21470] = 78562\n" +
            "mem[44450] = 77626\n" +
            "mem[19490] = 33608425\n" +
            "mem[4762] = 21717\n" +
            "mem[26613] = 40";
}
