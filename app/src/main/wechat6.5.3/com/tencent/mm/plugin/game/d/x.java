package com.tencent.mm.plugin.game.d;

import a.a.a.c.a;
import com.tencent.mm.protocal.c.aqp;
import com.tencent.mm.protocal.c.en;
import java.util.LinkedList;

public final class x extends aqp {
    public String gkz;
    public String glA;
    public String glB;
    public int glx;
    public int gly;
    public int glz;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.gkz != null) {
                aVar.e(2, this.gkz);
            }
            aVar.dV(3, this.glx);
            aVar.dV(4, this.gly);
            aVar.dV(5, this.glz);
            if (this.glA != null) {
                aVar.e(6, this.glA);
            }
            if (this.glB == null) {
                return 0;
            }
            aVar.e(7, this.glB);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.gkz != null) {
                r0 += a.a.a.b.b.a.f(2, this.gkz);
            }
            r0 = ((r0 + a.a.a.a.dS(3, this.glx)) + a.a.a.a.dS(4, this.gly)) + a.a.a.a.dS(5, this.glz);
            if (this.glA != null) {
                r0 += a.a.a.b.b.a.f(6, this.glA);
            }
            if (this.glB != null) {
                r0 += a.a.a.b.b.a.f(7, this.glB);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            x xVar = (x) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        xVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    xVar.gkz = aVar3.pMj.readString();
                    return 0;
                case 3:
                    xVar.glx = aVar3.pMj.mH();
                    return 0;
                case 4:
                    xVar.gly = aVar3.pMj.mH();
                    return 0;
                case 5:
                    xVar.glz = aVar3.pMj.mH();
                    return 0;
                case 6:
                    xVar.glA = aVar3.pMj.readString();
                    return 0;
                case 7:
                    xVar.glB = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
