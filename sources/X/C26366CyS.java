package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.camera.litecamera.LiteCameraView;
import java.util.List;

/* renamed from: X.CyS  reason: case insensitive filesystem */
public class C26366CyS implements Handler.Callback {
    public boolean handleMessage(Message message) {
        C26132Csv csv;
        switch (message.what) {
            case 1:
                List list = (List) message.obj;
                for (int i = 0; i < list.size(); i++) {
                    ((E93) list.get(i)).BnZ();
                }
                break;
            case 2:
                List list2 = (List) message.obj;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    ((E93) list2.get(i2)).Bni();
                    ((E93) list2.get(i2)).BnZ();
                }
                break;
            case 3:
                Object[] objArr = (Object[]) message.obj;
                List list3 = (List) objArr[0];
                Exception exc = (Exception) objArr[1];
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    ((E93) list3.get(i3)).BnS(exc);
                }
                break;
            case 4:
                Object[] objArr2 = (Object[]) message.obj;
                List list4 = (List) objArr2[0];
                String str = (String) objArr2[1];
                String str2 = (String) objArr2[2];
                for (int i4 = 0; i4 < list4.size(); i4++) {
                    ((E93) list4.get(i4)).Bna(str, str2);
                }
                break;
            case 5:
                ((C28654ECo) message.obj).Bny();
                return false;
            case 6:
                Object[] objArr3 = (Object[]) message.obj;
                C25866CnZ.A01((C25751ClL) objArr3[2]);
                ((C28654ECo) objArr3[0]).C0X((byte[]) objArr3[1]);
                return false;
            case 7:
                Object[] objArr4 = (Object[]) message.obj;
                ((E7R) objArr4[0]).Bnv((Exception) objArr4[1]);
                return false;
            case 8:
                Object[] objArr5 = (Object[]) message.obj;
                C25866CnZ.A02((C25815CmS) objArr5[1]);
                C28598E9p e9p = ((CY3) objArr5[0]).A00.A06;
                if (e9p != null) {
                    e9p.C9w();
                    return false;
                }
                break;
            case 9:
                Object[] objArr6 = (Object[]) message.obj;
                C25866CnZ.A02((C25815CmS) objArr6[1]);
                ((CY3) objArr6[0]).A00();
                return false;
            case 10:
                Object[] objArr7 = (Object[]) message.obj;
                ((CY3) objArr7[0]).A01((Exception) objArr7[1]);
                return false;
            case 11:
                Object[] objArr8 = (Object[]) message.obj;
                Point point = (Point) objArr8[1];
                C28598E9p e9p2 = ((C24819CLm) objArr8[0]).A00.A06;
                if (e9p2 != null) {
                    e9p2.Blw((float) point.x, (float) point.y);
                    return false;
                }
                break;
            case 12:
                LiteCameraView liteCameraView = ((C24819CLm) ((Object[]) message.obj)[0]).A00;
                liteCameraView.A0R.CJ0((C24819CLm) null);
                C28598E9p e9p3 = liteCameraView.A06;
                if (e9p3 != null) {
                    e9p3.Blx(true);
                    return false;
                }
                break;
            case 13:
            case 14:
                LiteCameraView liteCameraView2 = ((C24819CLm) message.obj).A00;
                liteCameraView2.A0R.CJ0((C24819CLm) null);
                C28598E9p e9p4 = liteCameraView2.A06;
                if (e9p4 != null) {
                    e9p4.Blx(false);
                    return false;
                }
                break;
            case 15:
                Object[] objArr9 = (Object[]) message.obj;
                DAU dau = (DAU) objArr9[0];
                C25556Chu chu = (C25556Chu) objArr9[1];
                int A0M = AnonymousClass000.A0M(objArr9[2]);
                int A0M2 = AnonymousClass000.A0M(objArr9[3]);
                if (A0M > 0 && A0M2 > 0 && (csv = (C26132Csv) chu.A02.A04(C25971Cpe.A0q)) != null) {
                    Matrix A0J = C108945cZ.A0J();
                    C28614EAk eAk = dau.A0Q;
                    if (eAk.CLb(A0J, A0M, A0M2, csv.A02, csv.A01, dau.A0F)) {
                        eAk.BdT(A0J, A0M, A0M2, chu.A00);
                        if (!dau.A0R.CSA()) {
                            dau.A0J.setTransform(A0J);
                            return false;
                        }
                    }
                }
                break;
        }
        return false;
    }
}
