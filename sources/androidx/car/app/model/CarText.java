package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CarText {
    public final List mSpans;
    public final List mSpansForVariants;
    public final String mText;
    public final List mTextVariants;

    public final class Builder {
        public CharSequence mText;
        public List mTextVariants;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarText)) {
            return false;
        }
        CarText carText = (CarText) obj;
        return AnonymousClass026.A00(this.mText, carText.mText) && AnonymousClass026.A00(this.mSpans, carText.mSpans) && AnonymousClass026.A00(this.mTextVariants, carText.mTextVariants) && AnonymousClass026.A00(this.mSpansForVariants, carText.mSpansForVariants);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mText;
        objArr[1] = this.mSpans;
        objArr[2] = this.mTextVariants;
        return AnonymousClass000.A0P(this.mSpansForVariants, objArr, 3);
    }

    public class SpanWrapper {
        public final CarSpan mCarSpan;
        public final int mEnd;
        public final int mFlags;
        public final int mStart;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpanWrapper)) {
                return false;
            }
            SpanWrapper spanWrapper = (SpanWrapper) obj;
            return this.mStart == spanWrapper.mStart && this.mEnd == spanWrapper.mEnd && this.mFlags == spanWrapper.mFlags && AnonymousClass026.A00(this.mCarSpan, spanWrapper.mCarSpan);
        }

        public int hashCode() {
            Object[] objArr = new Object[4];
            AnonymousClass000.A1L(objArr, this.mStart);
            AnonymousClass000.A1M(objArr, this.mEnd);
            objArr[2] = Integer.valueOf(this.mFlags);
            return AnonymousClass000.A0P(this.mCarSpan, objArr, 3);
        }

        public SpanWrapper(Spanned spanned, CarSpan carSpan) {
            this.mStart = spanned.getSpanStart(carSpan);
            this.mEnd = spanned.getSpanEnd(carSpan);
            this.mFlags = spanned.getSpanFlags(carSpan);
            this.mCarSpan = carSpan;
        }

        public String toString() {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("[");
            A10.append(this.mCarSpan);
            A10.append(": ");
            A10.append(this.mStart);
            A10.append(", ");
            A10.append(this.mEnd);
            A10.append(", flags: ");
            A10.append(this.mFlags);
            return AnonymousClass000.A0z(A10);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.car.app.model.CarSpan, android.text.style.CharacterStyle] */
        public SpanWrapper() {
            this.mStart = 0;
            this.mEnd = 0;
            this.mFlags = 0;
            this.mCarSpan = new CharacterStyle();
        }
    }

    public static String A00(CarText carText) {
        if (carText == null) {
            return null;
        }
        String obj = carText.toString();
        int length = obj.length();
        if (length <= 16) {
            return obj;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(obj.substring(0, 8));
        A10.append("~");
        return AnonymousClass000.A0y(obj.substring(length - 8), A10);
    }

    public CarText(Builder builder) {
        this.mText = builder.mText.toString();
        this.mSpans = A01(builder.mText);
        List list = builder.mTextVariants;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        for (int i = 0; i < list.size(); i++) {
            CharSequence charSequence = (CharSequence) list.get(i);
            A13.add(charSequence.toString());
            A132.add(A01(charSequence));
        }
        this.mTextVariants = Collections.unmodifiableList(new ArrayList(A13));
        this.mSpansForVariants = Collections.unmodifiableList(new ArrayList(A132));
    }

    public static List A01(CharSequence charSequence) {
        ArrayList A13 = AnonymousClass000.A13();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, charSequence.length(), Object.class)) {
                if (obj instanceof CarSpan) {
                    A13.add(new SpanWrapper(spanned, (CarSpan) obj));
                }
            }
        }
        return Collections.unmodifiableList(new ArrayList(A13));
    }

    public String toString() {
        return this.mText;
    }

    public CarText(CharSequence charSequence) {
        this.mText = "".toString();
        this.mSpans = A01("");
        this.mTextVariants = Collections.emptyList();
        this.mSpansForVariants = Collections.emptyList();
    }

    public CarText() {
        this.mText = "";
        this.mSpans = Collections.emptyList();
        this.mTextVariants = Collections.emptyList();
        this.mSpansForVariants = Collections.emptyList();
    }
}
