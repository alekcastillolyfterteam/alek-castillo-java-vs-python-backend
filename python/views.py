# Endpoint GET /api/cursos con Django REST Framework.
# Mismo resultado que la versión en Java, con menos conceptos previos.
from rest_framework.decorators import api_view
from rest_framework.response import Response

from .models import Curso
from .serializers import CursoSerializer


@api_view(["GET"])
def listar_cursos(request):
    cursos = Curso.objects.filter(activo=True)
    return Response(CursoSerializer(cursos, many=True).data)
