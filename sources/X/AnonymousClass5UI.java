package X;

import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

/* renamed from: X.5UI  reason: invalid class name */
public final class AnonymousClass5UI extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass47H this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UI(AnonymousClass47H r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        boolean A1a = AnonymousClass3MX.A1a((Boolean) obj);
        AnonymousClass47H r0 = this.this$0;
        if (A1a) {
            Intent intent = r0.getIntent();
            if (intent == null || intent.getIntExtra("request_code", -1) == -1) {
                this.this$0.setResult(-1);
            } else {
                AnonymousClass47H r2 = this.this$0;
                Intent A0A = C17880vN.A0A();
                Intent intent2 = this.this$0.getIntent();
                if (intent2 != null) {
                    i = intent2.getIntExtra("request_code", -1);
                } else {
                    i = -1;
                }
                A0A.putExtra("request_code", i);
                r2.setResult(-1, A0A);
            }
            this.this$0.finish();
        } else {
            Button button = r0.A00;
            if (button != null) {
                button.setEnabled(true);
                Toast.makeText(this.this$0, 2131898442, 0).show();
            } else {
                C18070vi.A11("setButton");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
