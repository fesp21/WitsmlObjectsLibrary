package com.hashmapinc.tempus.WitsmlObjects.Util;

import java.util.List;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrajectoryConverterTest {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    @Test
    public void shouldConvert1411To1311() throws Exception{
        String srcXML = TestUtilities.getResourceAsString("trajectory_converter/trajectory1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectorys)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory.class)).getTrajectory().get(0);

        // get converted object
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory dest = TrajectoryConverter.convertTo1311(src);

        // check fields
        assertEquals(src.getNameWell(), dest.getNameWell());
    }

    @Test
    public void shouldConvert20To1311() {
    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    @Test
    public void shouldConvert1311To1411() throws Exception{
        String srcXML = TestUtilities.getResourceAsString("trajectory_converter/trajectory1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectorys)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory.class)).getTrajectory().get(0);

        // get converted object
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory dest = TrajectoryConverter.convertTo1411(src);

        // check non-complex, non-repeating fields
        assertEquals(src.getNameWell(), dest.getNameWell());
        assertEquals(src.getNameWellbore(), dest.getNameWellbore());
        assertEquals(src.getName(), dest.getName());
        assertEquals(src.isObjectGrowing(), dest.isObjectGrowing());
        assertEquals(src.getDTimTrajStart(), dest.getDTimTrajStart());
        assertEquals(src.getServiceCompany(), dest.getServiceCompany());
        assertEquals(src.isDefinitive(), dest.isDefinitive());
        assertEquals(src.isMemory(), dest.isMemory());
        assertEquals(src.isFinalTraj(), dest.isFinalTraj());
        assertEquals(src.getDTimTrajEnd(), dest.getDTimTrajEnd());
        assertEquals(src.getUidWell(), dest.getUidWell());
        assertEquals(src.getUidWellbore(), dest.getUidWellbore());
        assertEquals(src.getUid(), dest.getUid());

        // check complex fields
        if (null != src.getMdMn()) {
            assertEquals(src.getMdMn().getValue(), dest.getMdMn().getValue());
            assertEquals(src.getMdMn().getDatum(), dest.getMdMn().getDatum());
            assertEquals(src.getMdMn().getUom().value(), dest.getMdMn().getUom().value());
        }
        if (null != src.getMdMx()) {
            assertEquals(src.getMdMx().getValue(), dest.getMdMx().getValue());
            assertEquals(src.getMdMx().getDatum(), dest.getMdMx().getDatum());
            assertEquals(src.getMdMx().getUom().value(), dest.getMdMx().getUom().value());
        }
        if (null != src.getMagDeclUsed()) {
            assertEquals(src.getMagDeclUsed().getValue(), dest.getMagDeclUsed().getValue());
            assertEquals(src.getMagDeclUsed().getUom(), dest.getMagDeclUsed().getUom());
        }
        if (null != src.getGridCorUsed()) {
            assertEquals(src.getGridCorUsed().getValue(), dest.getGridCorUsed().getValue());
            assertEquals(src.getGridCorUsed().getUom(), dest.getGridCorUsed().getUom());
        }
        if (null != src.getAziVertSect()) {
            assertEquals(src.getAziVertSect().getValue(), dest.getAziVertSect().getValue());
            assertEquals(src.getAziVertSect().getUom(), dest.getAziVertSect().getUom());
        }
        if (null != src.getDispNsVertSectOrig()) {
            assertEquals(src.getDispNsVertSectOrig().getValue(), dest.getDispNsVertSectOrig().getValue());
            assertEquals(src.getDispNsVertSectOrig().getUom(), dest.getDispNsVertSectOrig().getUom());
        }
        if (null != src.getDispEwVertSectOrig()) {
            assertEquals(src.getDispEwVertSectOrig().getValue(), dest.getDispEwVertSectOrig().getValue());
            assertEquals(src.getDispEwVertSectOrig().getUom(), dest.getDispEwVertSectOrig().getUom());
        }
        if (null != src.getAziRef())
            assertEquals(src.getAziRef().value(), dest.getAziRef().value());

        if (null != src.getCommonData()) {
            assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
            assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
            assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
            assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
            assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
        }
        if (null != src.getCustomData() && null != src.getCustomData().getAny()){
            for (int i = 0; i < src.getCustomData().getAny().size(); i++)
                assertEquals(src.getCustomData().getAny().get(i), dest.getCustomData().getAny().get(i));
        }

        // check repeating fields
        if (null != src.getTrajectoryStation()) {
            for (int i = 0; i < src.getTrajectoryStation().size(); i++) {
                com.hashmapinc.tempus.WitsmlObjects.v1311.CsTrajectoryStation srcStation = src.getTrajectoryStation().get(i);
                com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation destStation = dest.getTrajectoryStation().get(i);

                // check non-complex, non-repeating fields
                assertEquals(srcStation.getDTimStn(), destStation.getDTimStn());
                assertEquals(srcStation.getModelToolError(), destStation.getModelToolError());
                assertEquals(srcStation.isGravAccelCorUsed(), destStation.isGravAccelCorUsed());
                assertEquals(srcStation.isMagXAxialCorUsed(), destStation.isMagXAxialCorUsed());
                assertEquals(srcStation.isSagCorUsed(), destStation.isSagCorUsed());
                assertEquals(srcStation.isMagDrlstrCorUsed(), destStation.isMagDrlstrCorUsed());
                assertEquals(srcStation.getMagModelUsed(), destStation.getMagModelUsed());
                assertEquals(srcStation.getMagModelValid(), destStation.getMagModelValid());
                assertEquals(srcStation.getGeoModelUsed(), destStation.getGeoModelUsed());
                assertEquals(srcStation.getUid(), destStation.getUid());

                // check complex fields
                if (null != srcStation.getTarget()) {
                    assertEquals(srcStation.getTarget().getValue(), destStation.getTarget().getValue());
                    assertEquals(srcStation.getTarget().getUidRef(), destStation.getTarget().getUidRef());
                }
                if (null != srcStation.getTypeTrajStation())
                    assertEquals(srcStation.getTypeTrajStation().value(), destStation.getTypeTrajStation().value());
                if (null != srcStation.getTypeSurveyTool())
                    assertEquals(srcStation.getTypeSurveyTool().value(), destStation.getTypeSurveyTool());
                if (null != srcStation.getMd()) {
                    assertEquals(srcStation.getMd().getValue(), destStation.getMd().getValue());
                    assertEquals(srcStation.getMd().getUom().value(), destStation.getMd().getUom().value());
                    assertEquals(srcStation.getMd().getDatum(), destStation.getMd().getDatum());
                }
                if (null != srcStation.getTvd()) {
                    assertEquals(srcStation.getTvd().getValue(), destStation.getTvd().getValue());
                    assertEquals(srcStation.getTvd().getUom().value(), destStation.getTvd().getUom().value());
                    assertEquals(srcStation.getTvd().getDatum(), destStation.getTvd().getDatum());
                }
                if (null != srcStation.getIncl()) {
                    assertEquals(srcStation.getIncl().getValue(), destStation.getIncl().getValue());
                    assertEquals(srcStation.getIncl().getUom(), destStation.getIncl().getUom());
                }
                if (null != srcStation.getAzi()) {
                    assertEquals(srcStation.getAzi().getValue(), destStation.getAzi().getValue());
                    assertEquals(srcStation.getAzi().getUom(), destStation.getAzi().getUom());
                }
                if (null != srcStation.getMtf()) {
                    assertEquals(srcStation.getMtf().getValue(), destStation.getMtf().getValue());
                    assertEquals(srcStation.getMtf().getUom(), destStation.getMtf().getUom());
                }
                if (null != srcStation.getGtf()) {
                    assertEquals(srcStation.getGtf().getValue(), destStation.getGtf().getValue());
                    assertEquals(srcStation.getGtf().getUom(), destStation.getGtf().getUom());
                }
                if (null != srcStation.getDispNs()) {
                    assertEquals(srcStation.getDispNs().getValue(), destStation.getDispNs().getValue());
                    assertEquals(srcStation.getDispNs().getUom(), destStation.getDispNs().getUom());
                }
                if (null != srcStation.getDispEw()) {
                    assertEquals(srcStation.getDispEw().getValue(), destStation.getDispEw().getValue());
                    assertEquals(srcStation.getDispEw().getUom(), destStation.getDispEw().getUom());
                }
                if (null != srcStation.getVertSect()) {
                    assertEquals(srcStation.getVertSect().getValue(), destStation.getVertSect().getValue());
                    assertEquals(srcStation.getVertSect().getUom(), destStation.getVertSect().getUom());
                }
                if (null != srcStation.getDls()) {
                    assertEquals(srcStation.getDls().getValue(), destStation.getDls().getValue());
                    assertEquals(srcStation.getDls().getUom().value(), destStation.getDls().getUom().value());
                }
                if (null != srcStation.getRateTurn()) {
                    assertEquals(srcStation.getRateTurn().getValue(), destStation.getRateTurn().getValue());
                    assertEquals(srcStation.getRateTurn().getUom().value(), destStation.getRateTurn().getUom().value());
                }
                if (null != srcStation.getRateBuild()) {
                    assertEquals(srcStation.getRateBuild().getValue(), destStation.getRateBuild().getValue());
                    assertEquals(srcStation.getRateBuild().getUom().value(), destStation.getRateBuild().getUom().value());
                }
                if (null != srcStation.getMdDelta()) {
                    assertEquals(srcStation.getMdDelta().getValue(), destStation.getMdDelta().getValue());
                    assertEquals(srcStation.getMdDelta().getUom().value(), destStation.getMdDelta().getUom());
                }
                if (null != srcStation.getTvdDelta()) {
                    assertEquals(srcStation.getTvdDelta().getValue(), destStation.getTvdDelta().getValue());
                    assertEquals(srcStation.getTvdDelta().getUom().value(), destStation.getTvdDelta().getUom());
                }
                if (null != srcStation.getGravTotalUncert()) {
                    assertEquals(srcStation.getGravTotalUncert().getValue(), destStation.getGravTotalUncert().getValue());
                    assertEquals(srcStation.getGravTotalUncert().getUom().value(), destStation.getGravTotalUncert().getUom().value());
                }
                if (null != srcStation.getDipAngleUncert()) {
                    assertEquals(srcStation.getDipAngleUncert().getValue(), destStation.getDipAngleUncert().getValue());
                    assertEquals(srcStation.getDipAngleUncert().getUom(), destStation.getDipAngleUncert().getUom());
                }
                if (null != srcStation.getMagTotalUncert()) {
                    assertEquals(srcStation.getMagTotalUncert().getValue(), destStation.getMagTotalUncert().getValue());
                    assertEquals(srcStation.getMagTotalUncert().getUom().value(), destStation.getMagTotalUncert().getUom().value());
                }
                if (null != srcStation.getGravTotalFieldReference()) {
                    assertEquals(srcStation.getGravTotalFieldReference().getValue(), destStation.getGravTotalFieldReference().getValue());
                    assertEquals(srcStation.getGravTotalFieldReference().getUom().value(), destStation.getGravTotalFieldReference().getUom().value());
                }
                if (null != srcStation.getMagTotalFieldReference()) {
                    assertEquals(srcStation.getMagTotalFieldReference().getValue(), destStation.getMagTotalFieldReference().getValue());
                    assertEquals(srcStation.getMagTotalFieldReference().getUom().value(), destStation.getMagTotalFieldReference().getUom().value());
                }
                if (null != srcStation.getMagDipAngleReference()) {
                    assertEquals(srcStation.getMagDipAngleReference().getValue(), destStation.getMagDipAngleReference().getValue());
                    assertEquals(srcStation.getMagDipAngleReference().getUom(), destStation.getMagDipAngleReference().getUom());
                }
                if (null != srcStation.getStatusTrajStation())
                    assertEquals(srcStation.getStatusTrajStation().value(), destStation.getStatusTrajStation().value());
                if (null != srcStation.getRawData()) {
                    if (null != srcStation.getRawData().getGravAxialRaw()) {
                        assertEquals(srcStation.getRawData().getGravAxialRaw().getValue(), destStation.getRawData().getGravAxialRaw().getValue());
                        assertEquals(srcStation.getRawData().getGravAxialRaw().getUom().value(), destStation.getRawData().getGravAxialRaw().getUom().value());
                    }
                    if (null != srcStation.getRawData().getGravTran1Raw()) {
                        assertEquals(srcStation.getRawData().getGravTran1Raw().getValue(), destStation.getRawData().getGravTran1Raw().getValue());
                        assertEquals(srcStation.getRawData().getGravTran1Raw().getUom().value(), destStation.getRawData().getGravTran1Raw().getUom().value());
                    }
                    if (null != srcStation.getRawData().getGravTran2Raw()) {
                        assertEquals(srcStation.getRawData().getGravTran2Raw().getValue(), destStation.getRawData().getGravTran2Raw().getValue());
                        assertEquals(srcStation.getRawData().getGravTran2Raw().getUom().value(), destStation.getRawData().getGravTran2Raw().getUom().value());
                    }
                    if (null != srcStation.getRawData().getMagAxialRaw()) {
                        assertEquals(srcStation.getRawData().getMagAxialRaw().getValue(), destStation.getRawData().getMagAxialRaw().getValue());
                        assertEquals(srcStation.getRawData().getMagAxialRaw().getUom().value(), destStation.getRawData().getMagAxialRaw().getUom().value());
                    }
                    if (null != srcStation.getRawData().getMagTran1Raw()) {
                        assertEquals(srcStation.getRawData().getMagTran1Raw().getValue(), destStation.getRawData().getMagTran1Raw().getValue());
                        assertEquals(srcStation.getRawData().getMagTran1Raw().getUom().value(), destStation.getRawData().getMagTran1Raw().getUom().value());
                    }
                    if (null != srcStation.getRawData().getMagTran2Raw()) {
                        assertEquals(srcStation.getRawData().getMagTran2Raw().getValue(), destStation.getRawData().getMagTran2Raw().getValue());
                        assertEquals(srcStation.getRawData().getMagTran2Raw().getUom().value(), destStation.getRawData().getMagTran2Raw().getUom().value());
                    }

                }
                if (null != srcStation.getCorUsed()) {
                    if (null != srcStation.getCorUsed().getGravAxialAccelCor()) {
                        assertEquals(srcStation.getCorUsed().getGravAxialAccelCor().getValue(), destStation.getCorUsed().getGravAxialAccelCor().getValue());
                        assertEquals(srcStation.getCorUsed().getGravAxialAccelCor().getUom().value(), destStation.getCorUsed().getGravAxialAccelCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getGravTran1AccelCor()) {
                        assertEquals(srcStation.getCorUsed().getGravTran1AccelCor().getValue(), destStation.getCorUsed().getGravTran1AccelCor().getValue());
                        assertEquals(srcStation.getCorUsed().getGravTran1AccelCor().getUom().value(), destStation.getCorUsed().getGravTran1AccelCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getGravTran2AccelCor()) {
                        assertEquals(srcStation.getCorUsed().getGravTran2AccelCor().getValue(), destStation.getCorUsed().getGravTran2AccelCor().getValue());
                        assertEquals(srcStation.getCorUsed().getGravTran2AccelCor().getUom().value(), destStation.getCorUsed().getGravTran2AccelCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getMagAxialDrlstrCor()) {
                        assertEquals(srcStation.getCorUsed().getMagAxialDrlstrCor().getValue(), destStation.getCorUsed().getMagAxialDrlstrCor().getValue());
                        assertEquals(srcStation.getCorUsed().getMagAxialDrlstrCor().getUom().value(), destStation.getCorUsed().getMagAxialDrlstrCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getMagTran1DrlstrCor()) {
                        assertEquals(srcStation.getCorUsed().getMagTran1DrlstrCor().getValue(), destStation.getCorUsed().getMagTran1DrlstrCor().getValue());
                        assertEquals(srcStation.getCorUsed().getMagTran1DrlstrCor().getUom().value(), destStation.getCorUsed().getMagTran1DrlstrCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getMagTran2DrlstrCor()) {
                        assertEquals(srcStation.getCorUsed().getMagTran2DrlstrCor().getValue(), destStation.getCorUsed().getMagTran2DrlstrCor().getValue());
                        assertEquals(srcStation.getCorUsed().getMagTran2DrlstrCor().getUom().value(), destStation.getCorUsed().getMagTran2DrlstrCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getSagIncCor()) {
                        assertEquals(srcStation.getCorUsed().getSagIncCor().getValue(), destStation.getCorUsed().getSagIncCor().getValue());
                        assertEquals(srcStation.getCorUsed().getSagIncCor().getUom(), destStation.getCorUsed().getSagIncCor().getUom());
                    }
                    if (null != srcStation.getCorUsed().getSagAziCor()) {
                        assertEquals(srcStation.getCorUsed().getSagAziCor().getValue(), destStation.getCorUsed().getSagAziCor().getValue());
                        assertEquals(srcStation.getCorUsed().getSagAziCor().getUom(), destStation.getCorUsed().getSagAziCor().getUom());
                    }
                    if (null != srcStation.getCorUsed().getStnMagDeclUsed()) {
                        assertEquals(srcStation.getCorUsed().getStnMagDeclUsed().getValue(), destStation.getCorUsed().getStnMagDeclUsed().getValue());
                        assertEquals(srcStation.getCorUsed().getStnMagDeclUsed().getUom(), destStation.getCorUsed().getStnMagDeclUsed().getUom());
                    }
                    if (null != srcStation.getCorUsed().getStnGridCorUsed()) {
                        assertEquals(srcStation.getCorUsed().getStnGridCorUsed().getValue(), destStation.getCorUsed().getStnGridCorUsed().getValue());
                        assertEquals(srcStation.getCorUsed().getStnGridCorUsed().getUom(), destStation.getCorUsed().getStnGridCorUsed().getUom());
                    }
                    if (null != srcStation.getCorUsed().getDirSensorOffset()) {
                        assertEquals(srcStation.getCorUsed().getDirSensorOffset().getValue(), destStation.getCorUsed().getDirSensorOffset().getValue());
                        assertEquals(srcStation.getCorUsed().getDirSensorOffset().getUom(), destStation.getCorUsed().getDirSensorOffset().getUom());
                    }
                }
                if (null != srcStation.getValid()) {
                    if (null != srcStation.getValid().getMagTotalFieldCalc()) {
                        assertEquals(srcStation.getValid().getMagTotalFieldCalc().getValue(), destStation.getValid().getMagTotalFieldCalc().getValue());
                        assertEquals(srcStation.getValid().getMagTotalFieldCalc().getUom().value(), destStation.getValid().getMagTotalFieldCalc().getUom().value());
                    }
                    if (null != srcStation.getValid().getMagDipAngleCalc()) {
                        assertEquals(srcStation.getValid().getMagDipAngleCalc().getValue(), destStation.getValid().getMagDipAngleCalc().getValue());
                        assertEquals(srcStation.getValid().getMagDipAngleCalc().getUom(), destStation.getValid().getMagDipAngleCalc().getUom());
                    }
                    if (null != srcStation.getValid().getGravTotalFieldCalc()) {
                        assertEquals(srcStation.getValid().getGravTotalFieldCalc().getValue(), destStation.getValid().getGravTotalFieldCalc().getValue());
                        assertEquals(srcStation.getValid().getGravTotalFieldCalc().getUom().value(), destStation.getValid().getGravTotalFieldCalc().getUom().value());
                    }
                }
                if (null != srcStation.getMatrixCov()) {
                    if (null != srcStation.getMatrixCov().getVarianceNN()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceNN().getValue(), destStation.getMatrixCov().getVarianceNN().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceNN().getUom().value(), destStation.getMatrixCov().getVarianceNN().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceNE()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceNE().getValue(), destStation.getMatrixCov().getVarianceNE().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceNE().getUom().value(), destStation.getMatrixCov().getVarianceNE().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceNVert()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceNVert().getValue(), destStation.getMatrixCov().getVarianceNVert().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceNVert().getUom().value(), destStation.getMatrixCov().getVarianceNVert().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceEE()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceEE().getValue(), destStation.getMatrixCov().getVarianceEE().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceEE().getUom().value(), destStation.getMatrixCov().getVarianceEE().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceEVert()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceEVert().getValue(), destStation.getMatrixCov().getVarianceEVert().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceEVert().getUom().value(), destStation.getMatrixCov().getVarianceEVert().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceVertVert()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceVertVert().getValue(), destStation.getMatrixCov().getVarianceVertVert().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceVertVert().getUom().value(), destStation.getMatrixCov().getVarianceVertVert().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getBiasN()) {
                        assertEquals(srcStation.getMatrixCov().getBiasN().getValue(), destStation.getMatrixCov().getBiasN().getValue());
                        assertEquals(srcStation.getMatrixCov().getBiasN().getUom(), destStation.getMatrixCov().getBiasN().getUom());
                    }
                    if (null != srcStation.getMatrixCov().getBiasE()) {
                        assertEquals(srcStation.getMatrixCov().getBiasE().getValue(), destStation.getMatrixCov().getBiasE().getValue());
                        assertEquals(srcStation.getMatrixCov().getBiasE().getUom(), destStation.getMatrixCov().getBiasE().getUom());
                    }
                    if (null != srcStation.getMatrixCov().getBiasVert()) {
                        assertEquals(srcStation.getMatrixCov().getBiasVert().getValue(), destStation.getMatrixCov().getBiasVert().getValue());
                        assertEquals(srcStation.getMatrixCov().getBiasVert().getUom(), destStation.getMatrixCov().getBiasVert().getUom());
                    }

                }
                if (null != srcStation.getSourceStation()) {
                    assertEquals(srcStation.getSourceStation().getStationReference(), destStation.getSourceStation().getStationReference());
                    if (null != srcStation.getSourceStation().getTrajectoryParent()) {
                        assertEquals(srcStation.getSourceStation().getTrajectoryParent().getValue(), destStation.getSourceStation().getTrajectoryParent().getValue());
                        assertEquals(srcStation.getSourceStation().getTrajectoryParent().getUidRef(), destStation.getSourceStation().getTrajectoryParent().getUidRef());
                    }
                    if (null != srcStation.getSourceStation().getWellboreParent()) {
                        assertEquals(srcStation.getSourceStation().getWellboreParent().getValue(), destStation.getSourceStation().getWellboreParent().getValue());
                        assertEquals(srcStation.getSourceStation().getWellboreParent().getUidRef(), destStation.getSourceStation().getWellboreParent().getUidRef());
                    }
                }
                if (null != srcStation.getCommonData()) {
                    assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
                    assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
                    assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
                    assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
                    assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
                }

                // check repeating fields
                if (null != srcStation.getLocation()) {
                    List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation> srcStationLoc = srcStation.getLocation();
                    List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation> destStationLoc = destStation.getLocation();
                    for (int j = 0; j < srcStationLoc.size(); j++) {
                        // well crs
                        if (null != srcStationLoc.get(j).getWellCRS()) {
                            assertEquals(srcStationLoc.get(j).getWellCRS().getUidRef(), destStationLoc.get(j).getWellCRS().getUidRef());
                            assertEquals(srcStationLoc.get(j).getWellCRS().getValue(), destStationLoc.get(j).getWellCRS().getValue());
                        }

                        // latitude
                        if (null != srcStationLoc.get(j).getLatitude()) {
                            assertEquals(srcStationLoc.get(j).getLatitude().getUom(), destStationLoc.get(j).getLatitude().getUom());
                            assertEquals(srcStationLoc.get(j).getLatitude().getValue(), destStationLoc.get(j).getLatitude().getValue());
                        }

                        // longitude
                        if (null != srcStationLoc.get(j).getLongitude()) {
                            assertEquals(srcStationLoc.get(j).getLongitude().getUom(), destStationLoc.get(j).getLongitude().getUom());
                            assertEquals(srcStationLoc.get(j).getLongitude().getValue(), destStationLoc.get(j).getLongitude().getValue());
                        }

                        // easting
                        if (null != srcStationLoc.get(j).getEasting()) {
                            assertEquals(srcStationLoc.get(j).getEasting().getUom(), destStationLoc.get(j).getEasting().getUom());
                            assertEquals(srcStationLoc.get(j).getEasting().getValue(), destStationLoc.get(j).getEasting().getValue());
                        }

                        // northing
                        if (null != srcStationLoc.get(j).getNorthing()) {
                            assertEquals(srcStationLoc.get(j).getNorthing().getUom(), destStationLoc.get(j).getNorthing().getUom());
                            assertEquals(srcStationLoc.get(j).getNorthing().getValue(), destStationLoc.get(j).getNorthing().getValue());
                        }

                        // westing
                        if (null != srcStationLoc.get(j).getWesting()) {
                            assertEquals(srcStationLoc.get(j).getWesting().getUom(), destStationLoc.get(j).getWesting().getUom());
                            assertEquals(srcStationLoc.get(j).getWesting().getValue(), destStationLoc.get(j).getWesting().getValue());
                        }

                        // southing
                        if (null != srcStationLoc.get(j).getSouthing()) {
                            assertEquals(srcStationLoc.get(j).getSouthing().getUom(), destStationLoc.get(j).getSouthing().getUom());
                            assertEquals(srcStationLoc.get(j).getSouthing().getValue(), destStationLoc.get(j).getSouthing().getValue());
                        }

                        // projectedX
                        if (null != srcStationLoc.get(j).getProjectedX()) {
                            assertEquals(srcStationLoc.get(j).getProjectedX().getUom(), destStationLoc.get(j).getProjectedX().getUom());
                            assertEquals(srcStationLoc.get(j).getProjectedX().getValue(), destStationLoc.get(j).getProjectedX().getValue());
                        }

                        // projectedY
                        if (null != srcStationLoc.get(j).getProjectedY()) {
                            assertEquals(srcStationLoc.get(j).getProjectedY().getUom(), destStationLoc.get(j).getProjectedY().getUom());
                            assertEquals(srcStationLoc.get(j).getProjectedY().getValue(), destStationLoc.get(j).getProjectedY().getValue());
                        }

                        // localX
                        if (null != srcStationLoc.get(j).getLocalX()) {
                            assertEquals(srcStationLoc.get(j).getLocalX().getUom(), destStationLoc.get(j).getLocalX().getUom());
                            assertEquals(srcStationLoc.get(j).getLocalX().getValue(), destStationLoc.get(j).getLocalX().getValue());
                        }

                        // localY
                        if (null != srcStationLoc.get(j).getLocalY()) {
                            assertEquals(srcStationLoc.get(j).getLocalY().getUom(), destStationLoc.get(j).getLocalY().getUom());
                            assertEquals(srcStationLoc.get(j).getLocalY().getValue(), destStationLoc.get(j).getLocalY().getValue());
                        }

                        assertEquals(srcStationLoc.get(j).isOriginal(), destStationLoc.get(j).isOriginal());
                        assertEquals(srcStationLoc.get(j).getDescription(), destStationLoc.get(j).getDescription());
                        assertEquals(srcStationLoc.get(j).getUid(), destStationLoc.get(j).getUid());
                    }
                }

            }
        }

    }

    @Test
    public void shouldConvert20To1411() {
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    @Test
    public void shouldConvert1311To20() {
    }

    @Test
    public void shouldConvert1411To20() {
    }
    //=========================================================================
}
