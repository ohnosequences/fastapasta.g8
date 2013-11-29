import ohnosequences.awstools.s3.ObjectAddress
import ohnosequences.fastapasta._
import ohnosequences.nisperon.bundles.NisperonMetadataBuilder

object configuration extends FastaPastaConfig(
  readsTable = "test_table",
  fastqObject = ObjectAddress("fastapasta", "2G.fastq"),
  metadataBuilder = new NisperonMetadataBuilder(new generated.metadata.$name$()),
  email = "$email$",
  parsersAmount = 5,
  uploaders1Amount = 60,
  uploaders2Amount = 20,
  checkersAmount = 5
) {}

object $name$ extends FastaPasta(configuration)
