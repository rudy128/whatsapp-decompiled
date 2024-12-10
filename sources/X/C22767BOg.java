package X;

import android.text.Html;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;

/* renamed from: X.BOg  reason: case insensitive filesystem */
public abstract class C22767BOg extends C26667D8q implements E8U {
    public final String A00;

    public C22767BOg(String str) {
        super(new C22764BOb[2], new C22766BOe[2]);
        this.A00 = str;
        int i = this.A00;
        C26056CrS.A03(AnonymousClass000.A1T(i, r2));
        for (C22765BOc A002 : this.A0A) {
            A002.A00(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Cui] */
    public E91 A06(byte[] bArr, int i) {
        int i2;
        BP7 bp7 = (BP7) this;
        ArrayList A13 = AnonymousClass000.A13();
        int i3 = 0;
        long[] jArr = new long[32];
        ? obj = new Object();
        obj.A02 = bArr;
        obj.A00 = i;
        while (true) {
            String A0C = obj.A0C();
            if (A0C == null) {
                break;
            } else if (A0C.length() != 0) {
                try {
                    Integer.parseInt(A0C);
                    String A0C2 = obj.A0C();
                    if (A0C2 == null) {
                        BE7.A1M("Unexpected end", "HeroPlayer2SubripDecoder", new Object[0]);
                        break;
                    }
                    Matcher matcher = BP7.A01.matcher(A0C2);
                    if (matcher.matches()) {
                        boolean z = true;
                        long A002 = C26667D8q.A00(matcher, 1);
                        if (i3 == jArr.length) {
                            jArr = Arrays.copyOf(jArr, i3 * 2);
                        }
                        int i4 = i3;
                        int i5 = i3 + 1;
                        i3 = i5;
                        jArr[i4] = A002;
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            long A003 = C26667D8q.A00(matcher, 6);
                            if (i5 == jArr.length) {
                                jArr = Arrays.copyOf(jArr, i5 * 2);
                            }
                            i3 = i5 + 1;
                            jArr[i5] = A003;
                        } else {
                            z = false;
                        }
                        StringBuilder sb = bp7.A00;
                        sb.setLength(0);
                        while (true) {
                            String A0C3 = obj.A0C();
                            if (TextUtils.isEmpty(A0C3)) {
                                break;
                            }
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            sb.append(A0C3.trim());
                        }
                        String obj2 = sb.toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        A13.add(new C26009CqQ(Html.fromHtml(obj2)));
                        if (z) {
                            A13.add((Object) null);
                        }
                    } else {
                        BE7.A1M(AnonymousClass001.A1H("Skipping invalid timing: ", A0C2, AnonymousClass000.A10()), "HeroPlayer2SubripDecoder", new Object[0]);
                    }
                } catch (NumberFormatException unused) {
                    BE7.A1M(AnonymousClass001.A1H("Skipping invalid index: ", A0C, AnonymousClass000.A10()), "HeroPlayer2SubripDecoder", new Object[0]);
                }
            }
        }
        int size = A13.size();
        C26009CqQ[] cqQArr = new C26009CqQ[size];
        A13.toArray(cqQArr);
        long[] copyOf = Arrays.copyOf(jArr, i3);
        ArrayList A132 = AnonymousClass000.A13();
        for (int i6 = 0; i6 < size; i6++) {
            A132.add(new DS7(cqQArr[i6], copyOf[i6]));
        }
        Collections.sort(A132);
        for (i2 = 0; i2 < size; i2++) {
            DS7 ds7 = (DS7) A132.get(i2);
            cqQArr[i2] = ds7.A01;
            copyOf[i2] = ds7.A00;
        }
        return new C26677D9a(copyOf, cqQArr);
    }

    public final String getName() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ void A05(BOY boy) {
        super.A05(boy);
    }

    public final void A07(C22766BOe bOe) {
        super.A05(bOe);
    }
}
