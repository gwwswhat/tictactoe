import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity: ComponentActivity(){
	override fun onCreate(savedInstanceState: Bundle?){
		super.onCreate(savedInstanceState)
		setContent {
			my_app()
		}
	}
}

@Composable
fun my_app(){
	var text by remember { mutableStateOf("Hello World!") }
	Column(
		modifier = Modifier
		  .fillMaxSize()
			.padding(16.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	){
		Text(text = text, fontSize = 24.sp)
		Spacer(modifier = Modifier.height(20.dp))
		Button(onClick = { text = "You really clicked huh?" } ){
			Text("Click me!")
		}
	}
}
