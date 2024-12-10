package X;

import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.19C  reason: invalid class name */
public class AnonymousClass19C implements AnonymousClass19A {
    public void BC7(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: annotationKeyTooLong for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void BC8(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: annotationMisuse ");
        sb.append(i);
        sb.append(" : ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void BC9(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: annotationSizeLimitExceeded for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(": ");
        sb.append(i2);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void BCt() {
        Log.e("QPL: backgroundListenerEventsFull");
    }

    public void BKV(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorCompressingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void BKW(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorDeletingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void BKX(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorParsingConfig: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void BKY(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorUploadingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void BKZ(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorWritingToFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void BKg(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: eventBuilderRepeatedSubmit ");
        sb.append(i);
        Log.e(sb.toString());
    }

    public void Bd2(int i, String str, double d) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: illegalDoubleAnnotation for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(": ");
        sb.append(d);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void BhE(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: jsonFormatError for marker: ");
        sb.append(i);
        sb.append(" msg: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void Bj8() {
        Log.e("QPL: maxFileCountReached");
    }

    public void BjG(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: maxMarkerCountExceeded for marker: ");
        sb.append(i);
        Log.e(sb.toString());
    }

    public void BjH(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: maxPointCountExceeded for marker: ");
        sb.append(i);
        Log.e(sb.toString());
    }

    public void BkP(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: noPointName ");
        sb.append(i);
        Log.e(sb.toString());
    }

    public void CBl(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: pointDataTooLong for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void CBm(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: pointNameTooLong for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void CBn(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: pointToEndAtNotFound for marker: ");
        sb.append(i);
        sb.append(" and pointName: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void CFO(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: reportWarning ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void CPb(Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: tooManyOpenMarkersToWrite: ");
        sb.append(collection);
        Log.e(sb.toString());
    }

    public void CQ8() {
        Log.e("QPL: unfinishedListenerEventRemaining");
    }
}
