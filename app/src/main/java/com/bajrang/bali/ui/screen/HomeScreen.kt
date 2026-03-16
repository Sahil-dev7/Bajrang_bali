package com.bajrang.bali.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bajrang.bali.R
import com.bajrang.bali.ui.theme.BajrangBaliTheme

val AakashFont = FontFamily(
    Font(R.font.ams_aakash, FontWeight.Normal)
)

@Composable
fun HomeScreen(innerPadding: PaddingValues) {

    val chalisa = listOf(
        "॥ दोहा ॥\n\nश्रीगुरु चरन सरोज रज, निज मन मुकुर सुधारि।\nबरनउँ रघुबर बिमल जसु, जो दायक फल चारि॥",

        "॥ चौपाई ॥\n\nजय हनुमान ज्ञान गुन सागर।\nजय कपीस तिहुँ लोक उजागर॥",

        "राम दूत अतुलित बल धामा।\nअंजनि पुत्र पवनसुत नामा॥",

        "महावीर विक्रम बजरंगी।\nकुमति निवार सुमति के संगी॥",

        "कंचन बरन बिराज सुबेसा।\nकानन कुंडल कुंचित केसा॥",

        "हाथ वज्र औ ध्वजा बिराजे।\nकाँधे मूँज जनेऊ साजे॥",

        "शंकर सुवन केसरी नंदन।\nतेज प्रताप महा जग वंदन॥",

        "विद्यावान गुनी अति चातुर।\nराम काज करिबे को आतुर॥",

        "प्रभु चरित्र सुनिबे को रसिया।\nराम लखन सीता मन बसिया॥",

        "सूक्ष्म रूप धरि सियहिं दिखावा।\nविकट रूप धरि लंक जरावा॥",

        "भीम रूप धरि असुर संहारे।\nरामचन्द्र के काज संवारे॥",

        "लाय सजीवन लखन जियाए।\nश्रीरघुबीर हरषि उर लाए॥",

        "रघुपति कीन्ही बहुत बड़ाई।\nतुम मम प्रिय भरतहि सम भाई॥",

        "सहस बदन तुम्हरो जस गावैं।\nअस कहि श्रीपति कंठ लगावैं॥",

        "सनकादिक ब्रह्मादि मुनीसा।\nनारद सारद सहित अहीसा॥",

        "यम कुबेर दिगपाल जहाँ ते।\nकवि कोविद कहि सके कहाँ ते॥",

        "तुम उपकार सुग्रीवहिं कीन्हा।\nराम मिलाय राज पद दीन्हा॥",

        "तुम्हरो मंत्र विभीषण माना।\nलंकेश्वर भए सब जग जाना॥",

        "जुग सहस्त्र जोजन पर भानू।\nलील्यो ताहि मधुर फल जानू॥",

        "प्रभु मुद्रिका मेलि मुख माहीं।\nजलधि लांघि गए अचरज नाहीं॥",

        "दुर्गम काज जगत के जेते।\nसुगम अनुग्रह तुम्हरे तेते॥",

        "राम दुआरे तुम रखवारे।\nहोत न आज्ञा बिनु पैसारे॥",

        "सब सुख लहै तुम्हारी सरना।\nतुम रक्षक काहू को डरना॥",

        "आपन तेज सम्हारो आपै।\nतीनों लोक हाँक ते काँपै॥",

        "भूत पिशाच निकट नहिं आवै।\nमहावीर जब नाम सुनावै॥",

        "नासै रोग हरै सब पीरा।\nजपत निरंतर हनुमत बीरा॥",

        "संकट ते हनुमान छुड़ावै।\nमन क्रम वचन ध्यान जो लावै॥",

        "सब पर राम तपस्वी राजा।\nतिन के काज सकल तुम साजा॥",

        "और मनोरथ जो कोई लावै।\nसोई अमित जीवन फल पावै॥",

        "चारों जुग परताप तुम्हारा।\nहै परसिद्ध जगत उजियारा॥",

        "साधु संत के तुम रखवारे।\nअसुर निकंदन राम दुलारे॥",

        "अष्ट सिद्धि नव निधि के दाता।\nअस बर दीन जानकी माता॥",

        "राम रसायन तुम्हरे पासा।\nसदा रहो रघुपति के दासा॥",

        "तुम्हरे भजन राम को पावै।\nजनम जनम के दुख बिसरावै॥",

        "अंतकाल रघुबर पुर जाई।\nजहाँ जन्म हरि भक्त कहाई॥",

        "और देवता चित्त न धरई।\nहनुमत सेइ सर्व सुख करई॥",

        "संकट कटै मिटै सब पीरा।\nजो सुमिरै हनुमत बलबीरा॥",

        "जय जय जय हनुमान गोसाईं।\nकृपा करहु गुरुदेव की नाईं॥",
        "जो सत बार पाठ कर कोई।\nछूटहि बंदि महा सुख होई॥",
        "जो यह पढ़े हनुमान चालीसा।\nहोय सिद्धि साखी गौरीसा॥",
        "तुलसीदास सदा हरि चेरा।\nकीजै नाथ हृदय महँ डेरा॥",
        "॥ दोहा ॥\n\nपवन तनय संकट हरन, मंगल मूरति रूप।\nराम लखन सीता सहित, हृदय बसहु सुर भूप॥"
    )
    var index by remember { mutableIntStateOf(0) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.hanuman_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Semi-transparent overlay to make text more readable
        Surface(
            color = Color.White.copy(alpha = 0.5f),
            modifier = Modifier.fillMaxSize()
        ) {}

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "हनुमान चालीसा",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = AakashFont,
                color = Color(0xFF4E342E),
                textAlign = TextAlign.Center
            )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState()),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = chalisa[index],
                    fontSize = 26.sp,
                    lineHeight = 38.sp,
                    fontFamily = AakashFont,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "${index + 1} / ${chalisa.size}",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Button(
                        onClick = { if (index > 0) index-- },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFF6F00)
                        )
                    ) {
                        Text(
                            "Prev",
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }

                    Button(
                        onClick = { if (index < chalisa.size - 1) index++ },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFF6F00)
                        )
                    ) {
                        Text(
                            "Next",
                            fontFamily = FontFamily.SansSerif ,
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    BajrangBaliTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}