package Page2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hansol.spot_200510_hs.R;

public class Page2_1 extends AppCompatActivity implements View.OnClickListener {
    /*
     * subject_1 = 자연
     * subject_2 = 역사
     * subject_3 = 휴양
     * subject_4 = 체험
     * subject_5 = 산업
     * subject_6 = 건축/조형
     * subject_7 = 문화
     * subject_8 = 레포츠
     */

    int[] button_id = {R.id.page2_1_subject_1, R.id.page2_1_subject_2, R.id.page2_1_subject_3,
            R.id.page2_1_subject_4, R.id.page2_1_subject_5, R.id.page2_1_subject_6,
            R.id.page2_1_subject_7, R.id.page2_1_subject_8};
    String[] subject_name = {"자연", "역사", "휴양", "체험", "산업", "건축/조형", "문화", "레포츠"};
    Button[] subject = new Button[button_id.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2_1);

        for(int i = 0; i<button_id.length; i++){
            subject[i] = (Button) findViewById(button_id[i]);
            subject[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        for(int i =0; i < subject.length; i++) {

            if(subject[i].getId() == view.getId()) {
                Intent intent = new Intent(this, Page2.class);
                intent.putExtra("subject_name_from_Page2_1", subject_name[i]);
                startActivity(intent);
            }
        }
    }
}
