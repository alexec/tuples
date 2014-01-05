package tuples.dm;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * @author alex.collins
 */
@SupportedAnnotationTypes({"tuples.dm.PrimitiveType"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class PTProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element elem : roundEnv.getElementsAnnotatedWith(PrimitiveTuple.class)) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "hello");
        }
        return true;
    }
}