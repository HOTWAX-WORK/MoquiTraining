def moquiTraining = ec.entity.makeValue("MoquiTraining")
moquiTraining.setFields(context, true, null, null)
moquiTraining.setSequencedIdPrimary()
moquiTraining.create()