package X;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: X.0Pz  reason: invalid class name and case insensitive filesystem */
public final class C05010Pz {
    public static final C05010Pz A00 = new Object();

    public static final void A03(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Consumer consumer, long[] jArr) {
        for (long j : jArr) {
            AnonymousClass0HU r0 = (AnonymousClass0HU) AnonymousClass000.A0w(androidComposeViewAccessibilityDelegateCompat.A0c(), (int) j);
            if (r0 != null) {
                C05060Qg r3 = r0.A01;
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidComposeViewAccessibilityDelegateCompat.A1c().getAutofillId(), (long) r3.A02);
                String A04 = C05170Qs.A04(r3);
                if (A04 != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new C27069DRu((List) null, 6, A04)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static final AnonymousClass7TD A00(LongSparseArray longSparseArray) {
        return new AnonymousClass7TD(longSparseArray);
    }

    public final void A04(LongSparseArray longSparseArray, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (C18070vi.A18(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            A01(longSparseArray, androidComposeViewAccessibilityDelegateCompat);
        } else {
            androidComposeViewAccessibilityDelegateCompat.A1c().post(new AnonymousClass0ZI(longSparseArray, androidComposeViewAccessibilityDelegateCompat));
        }
    }

    public static final void A01(LongSparseArray longSparseArray, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        TranslationResponseValue value;
        CharSequence text;
        AnonymousClass0HU r0;
        AnonymousClass0KP r02;
        C22821Di r4;
        AnonymousClass7TD A002 = A00(longSparseArray);
        while (A002.hasNext()) {
            long A003 = A002.A00();
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(A003);
            if (!(viewTranslationResponse == null || (value = viewTranslationResponse.getValue("android:text")) == null || (text = value.getText()) == null || (r0 = (AnonymousClass0HU) AnonymousClass000.A0w(androidComposeViewAccessibilityDelegateCompat.A0c(), (int) A003)) == null || (r02 = (AnonymousClass0KP) AnonymousClass0FY.A00(r0.A01.A0H(), C03120Gr.A0N)) == null || (r4 = (C22821Di) r02.A00()) == null)) {
                r4.invoke(new C27069DRu((List) null, 6, text.toString()));
            }
        }
    }
}
