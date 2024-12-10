package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewConfiguration;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.expressionstray.ExpressionsTrayViewModel;
import com.whatsapp.expressionstray.ExpressionsTrayViewModel$onEmojiBackspaceClick$1;
import com.whatsapp.music.ui.MusicBrowseFragment;
import com.whatsapp.music.viewmodels.MusicBrowseViewModel$executeRequestHandler$2$1$handleMessage$1;
import java.util.List;

/* renamed from: X.5dh  reason: invalid class name and case insensitive filesystem */
public class C109595dh extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109595dh(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    public void handleMessage(Message message) {
        int i;
        AnonymousClass1FU r0;
        Message message2 = message;
        switch (this.A00) {
            case 0:
                int i2 = message2.what;
                C125716bZ r02 = ((C140086zv) this.A01).A05;
                if (i2 == 1) {
                    AnonymousClass7DY r2 = r02.A00;
                    C160978Av r03 = r2.A0K;
                    if (r03 != null) {
                        if (r03.Bf2()) {
                            C160978Av r04 = r2.A0K;
                            if (r04 != null) {
                                if (!r04.isRecording() && (r0 = r2.A0H) != null && !r0.Bed()) {
                                    AnonymousClass7DY.A0J(r2);
                                    return;
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C18070vi.A11("camera");
                    throw null;
                }
                AnonymousClass7DY r3 = r02.A00;
                r3.A1N.CGL(new AnonymousClass7R9((Object) r3, 13), "wa_working_recording_update_time_token");
                return;
            case 1:
                C145777Mo r5 = (C145777Mo) this.A01;
                int i3 = C145777Mo.A15;
                AnonymousClass70T r05 = r5.A0M;
                if (r05 == null) {
                    return;
                }
                if (r05.A0C()) {
                    int A09 = r5.A09();
                    r5.A02 = A09;
                    C160838Ad r06 = r5.A0H;
                    if (r06 != null && C108995ce.A1X(r06, r5)) {
                        r5.A0H.C20(A09);
                    }
                    if (r5.A0U) {
                        C63552tI r32 = r5.A0e;
                        C63552tI.A00(r32).execute(new C70653Bz(r32, r5, 18));
                    }
                    C1600486x r7 = r5.A0I;
                    if (r7 != null && r5.A0E == null) {
                        int i4 = r5.A05 + 1;
                        r5.A05 = i4;
                        byte[] bArr = C145777Mo.A16;
                        if (bArr == null) {
                            bArr = new byte[128];
                            C145777Mo.A16 = bArr;
                            int i5 = 0;
                            do {
                                double d = ((double) i5) * 3.141592653589793d;
                                bArr[i5] = (byte) ((int) ((Math.sin((d * 32.0d) / 128.0d) * Math.abs(Math.sin((d * 4.0d) / 128.0d)) * Math.abs(Math.sin((d * 1.0d) / 128.0d)) * 64.0d) + 128.0d));
                                i5++;
                            } while (i5 < 128);
                        }
                        if (i4 % 4 == 0) {
                            for (int i6 = 0; i6 < bArr.length; i6++) {
                                bArr[i6] = (byte) (256 - bArr[i6]);
                            }
                        }
                        r7.CAT(bArr);
                    }
                    sendEmptyMessageDelayed(0, 50);
                    return;
                } else if (!r5.A0R) {
                    r5.A0A();
                    return;
                } else {
                    return;
                }
            case 2:
                ExpressionsTrayViewModel A002 = ((ExpressionsTrayView) this.A01).getExpressionsViewModel();
                AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onEmojiBackspaceClick$1(A002, (C30391dr) null), C41561wd.A00(A002));
                sendEmptyMessageDelayed(0, (long) ViewConfiguration.getKeyRepeatDelay());
                return;
            case 3:
                C119966Aq r4 = (C119966Aq) this.A01;
                List list = C42011xT.A0I;
                AnonymousClass73N r33 = (AnonymousClass73N) r4.A02.get();
                AnonymousClass73N.A02(r33, 23);
                C1418277c r07 = r4.A00;
                if (r07 != null) {
                    i = r07.A01();
                } else {
                    i = 0;
                }
                AnonymousClass73N.A03(r33, new AnonymousClass7RM((Object) r33, i, 30));
                C119966Aq.A00(r4, false);
                return;
            case 4:
                ((MusicBrowseFragment) this.A01).A07 = false;
                return;
            case 5:
                C18070vi.A0d(message2, 0);
                C111155iT r42 = (C111155iT) this.A01;
                C30391dr A0j = C108975cc.A0j(r42.A02);
                String string = message2.getData().getString("end_cursor_from_prev_query");
                r42.A02 = AnonymousClass3MY.A0s(new MusicBrowseViewModel$executeRequestHandler$2$1$handleMessage$1(message2, r42, string, A0j), C41561wd.A00(r42));
                return;
            default:
                ((C27231Vg) this.A01).A01();
                return;
        }
    }
}
