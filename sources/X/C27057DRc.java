package X;

import java.io.Serializable;

/* renamed from: X.DRc  reason: case insensitive filesystem */
public class C27057DRc implements Serializable {
    public static final long serialVersionUID = 1663511998052L;
    public final int cell2GValue;
    public final int cell3GValue;
    public final int cell4GValue;
    public final int defaultValue;
    public final int degradedValue;
    public final int excellentValue = 0;
    public final int goodValue;
    public final int moderateValue;
    public final int poorValue;
    public final boolean useNetworkQuality = false;
    public final boolean useNetworkQualityWifiOnly = false;
    public final boolean useNetworkType = false;
    public final int wifiValue;

    public C27057DRc(CRP crp) {
        this.goodValue = crp.A01;
        this.moderateValue = crp.A02;
        this.poorValue = crp.A03;
        this.degradedValue = crp.A00;
        this.wifiValue = 0;
        this.cell4GValue = 0;
        this.cell3GValue = 0;
        this.cell2GValue = 0;
        this.defaultValue = 0;
    }
}
