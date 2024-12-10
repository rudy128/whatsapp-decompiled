package X;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.calling.dialer.DialerActivity;
import com.whatsapp.calling.dialer.DialpadKey;
import java.util.ArrayList;

/* renamed from: X.4ds  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90314ds implements View.OnTouchListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DialerActivity A01;
    public final /* synthetic */ DialpadKey A02;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        DialpadKey dialpadKey = this.A02;
        DialerActivity dialerActivity = this.A01;
        int i = this.A00;
        ArrayList arrayList = DialerActivity.A0I;
        C18070vi.A0d(dialpadKey, 0);
        if (motionEvent.getAction() == 0) {
            dialpadKey.performHapticFeedback(3);
            AudioManager A0D = dialerActivity.A08.A0D();
            if (A0D != null) {
                num = Integer.valueOf(A0D.getRingerMode());
            } else {
                num = null;
            }
            Integer[] numArr = new Integer[2];
            AnonymousClass3MX.A1R(numArr, 0);
            if (!C29431cG.A18(C18070vi.A0O(1, numArr, 1), num)) {
                ToneGenerator toneGenerator = dialerActivity.A00;
                if (toneGenerator == null) {
                    C18070vi.A11("toneGenerator");
                    throw null;
                }
                toneGenerator.startTone(i, -1);
            }
        }
        Integer[] numArr2 = new Integer[2];
        C17880vN.A1T(numArr2, 1, 0);
        if (AnonymousClass3Ma.A1b(C18070vi.A0O(C17880vN.A0j(), numArr2, 1), motionEvent.getAction())) {
            ToneGenerator toneGenerator2 = dialerActivity.A00;
            if (toneGenerator2 == null) {
                C18070vi.A11("toneGenerator");
                throw null;
            }
            toneGenerator2.stopTone();
        }
        return false;
    }

    public /* synthetic */ C90314ds(DialerActivity dialerActivity, DialpadKey dialpadKey, int i) {
        this.A02 = dialpadKey;
        this.A01 = dialerActivity;
        this.A00 = i;
    }
}
